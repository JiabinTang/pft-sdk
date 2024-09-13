package cn.tangjiabin.pft.client;

import cn.tangjiabin.pft.config.PFTConfig;

import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;

/**
 * Soap请求
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-11
 */

public class SoapClient {

    private static SoapClient instance;
    private final PFTConfig config;

    private SoapClient(PFTConfig config) {
        this.config = config;
    }

    public static synchronized SoapClient getInstance(PFTConfig config) {
        if (instance == null) {
            instance = new SoapClient(config);
        }
        return instance;
    }

    public SOAPMessage call(String action, SOAPMessage request) throws SOAPException, IOException {
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();
        return soapConnection.call(request, new URL(config.getUrl()));

    }
}
