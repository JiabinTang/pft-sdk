package cn.tangjiabin.pft.soap.strategy;

import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.soap.SoapStrategy;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 默认Soap策略类
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-13
 */


public class DefaultSoapStrategy<T, R> implements SoapStrategy<T, R> {

    @Override
    public SOAPMessage createRequest(String methodName, T request, PFTConfig config) throws SOAPException, IllegalAccessException {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        SOAPEnvelope envelope = soapPart.getEnvelope();
        SOAPBody soapBody = envelope.getBody();

        SOAPElement soapBodyElem = soapBody.addChildElement(methodName);
        soapBodyElem.addChildElement("ac").addTextNode(config.getAc());
        soapBodyElem.addChildElement("pw").addTextNode(config.getPw());

        Field[] fields = request.getClass().getDeclaredFields();

        Arrays.sort(fields, Comparator.comparingInt(field -> {
            try {
                return field.getDeclaringClass().getDeclaredField(field.getName()).getModifiers();
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }));

        for (Field field : fields) {
            field.setAccessible(true);
            soapBodyElem.addChildElement(field.getName()).addTextNode(String.valueOf(field.get(request)));
        }

        soapMessage.saveChanges();
        return soapMessage;
    }


    @Override
    public Data<R> parseResponse(SOAPMessage response, String responseTag, Class<R> clazz) throws Exception {
        List<R> recs = new ArrayList<>();
        SOAPBody soapBody = response.getSOAPBody();
        // 打印响应消息
        // printMessage(response);

        SOAPElement responseElement = (SOAPElement) soapBody.getElementsByTagName(responseTag).item(0);
        String nestedXmlString = responseElement.getTextContent().trim();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new ByteArrayInputStream(nestedXmlString.getBytes()));

        NodeList recList = document.getElementsByTagName("Rec");
        for (int i = 0; i < recList.getLength(); i++) {
            Element recElement = (Element) recList.item(i);
            NodeList errorCode = recElement.getElementsByTagName("UUerrorcode");
            NodeList errorInfo = recElement.getElementsByTagName("UUerrorinfo");
            if (errorCode.getLength() > 0 && errorInfo.getLength() > 0) {
                String code = errorCode.item(0).getTextContent();
                String info = errorInfo.item(0).getTextContent();
                return new Data<R>(code, info);
            }
            int size = 0;
            Field[] fields = clazz.getDeclaredFields();
            if (fields.length > 0) {
                String name = fields[0].getName();
                NodeList nodeList = recElement.getElementsByTagName(name);
                size = nodeList.getLength();
            }
            for (int j = 0; j < size; j++) {
                R rec = clazz.getDeclaredConstructor().newInstance();
                for (Field field : clazz.getDeclaredFields()) {
                    String tagName = field.getName();
                    NodeList nodeList = recElement.getElementsByTagName(tagName);
                    if (nodeList.getLength() > 0) {
                        String value = nodeList.item(j).getTextContent();
                        field.setAccessible(true);
                        field.set(rec, value);
                    }
                }
                recs.add(rec);
            }
        }

        return new Data<R>(recs);
    }


    private static void printMessage(SOAPMessage response) throws SOAPException, IOException {
        OutputStream os = new ByteArrayOutputStream();
        response.writeTo(os);
        String output = os.toString();

        String escapedOutput = output
                .replaceAll("&amp;", "&")
                .replaceAll("&lt;", "<")
                .replaceAll("&gt;", ">")
                .replaceAll("&quot;", "\"")
                .replaceAll("&apos;", "'");
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        System.out.println(escapedOutput);
        System.out.println();
        System.out.println("==============================");
        System.out.println();
    }
}
