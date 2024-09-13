package cn.tangjiabin.pft.soap;

import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.model.response.Data;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

/**
 * Soap策略接口
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-13
 */


public interface SoapStrategy<T,R> {

    SOAPMessage createRequest(String methodName, T request, PFTConfig config) throws SOAPException, IllegalAccessException;

    Data<R> parseResponse(SOAPMessage response, String responseTag, Class<R> clazz) throws Exception;
}
