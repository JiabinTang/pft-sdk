package cn.tangjiabin.pft.soap;

import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.model.response.Data;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

/**
 * Soap上下文
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-13
 */


public class SoapContext<T,R> {

    private SoapStrategy<T,R> strategy;

    public SoapContext(SoapStrategy<T,R> strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SoapStrategy<T,R> strategy) {
        this.strategy = strategy;
    }

    public SOAPMessage createRequest(String methodName, T request, PFTConfig config) throws SOAPException, IllegalAccessException {
        return strategy.createRequest(methodName, request, config);
    }

    public Data<R> parseResponse(SOAPMessage response, String responseTag, Class<R> clazz) throws Exception {
        return strategy.parseResponse(response, responseTag, clazz);
    }

}
