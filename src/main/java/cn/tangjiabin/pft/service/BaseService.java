package cn.tangjiabin.pft.service;

import cn.tangjiabin.pft.client.SoapClient;
import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.soap.SoapContext;

import javax.xml.soap.SOAPMessage;

/**
 * 基础服务
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-13
 */


public interface BaseService {

    default <T, R> Data<R> processRequest(String methodName, T request, PFTConfig config, SoapClient soapClient, SoapContext<T,R> context, Class<R> responseClass) {
        try {
            SOAPMessage soapRequest = context.createRequest(methodName, request, config);
            SOAPMessage soapResponse = soapClient.call(methodName, soapRequest);
            return context.parseResponse(soapResponse, methodName, responseClass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
