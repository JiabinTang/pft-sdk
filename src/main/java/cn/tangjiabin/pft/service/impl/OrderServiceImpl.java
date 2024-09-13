package cn.tangjiabin.pft.service.impl;

import cn.tangjiabin.pft.client.SoapClient;
import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.config.PFTMethods;
import cn.tangjiabin.pft.model.request.order.*;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.order.*;
import cn.tangjiabin.pft.service.OrderService;
import cn.tangjiabin.pft.soap.SoapContext;
import cn.tangjiabin.pft.soap.strategy.DefaultSoapStrategy;

/**
 * 订单服务实现
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-13
 */


public class OrderServiceImpl implements OrderService {

    protected SoapClient soapClient;
    protected PFTConfig config;

    public OrderServiceImpl(PFTConfig config) {
        this.config = config;
        this.soapClient = SoapClient.getInstance(config);
    }


    /**
     * 预判下单 （判断提交的参数是否满足下单条件，没有生成订单；可选）
     * OrderPreCheck
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<OrderPreCheckResponse> orderPreCheck(OrderPreCheckRequest request) {
        SoapContext<OrderPreCheckRequest, OrderPreCheckResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Order.ORDER_PRE_CHECK, request, config, soapClient, context, OrderPreCheckResponse.class);
    }

    /**
     * 提交订单 （已支付订单提交，必接）
     * PFT_Order_Submit
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<OrderSubmitResponse> orderSubmit(OrderSubmitRequest request) {
        SoapContext<OrderSubmitRequest, OrderSubmitResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Order.PFT_ORDER_SUBMIT, request, config, soapClient, context, OrderSubmitResponse.class);
    }

    /**
     * 查询订单（可选）
     * OrderQuery
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<OrderQueryResponse> orderQuery(OrderQueryRequest request) {
        SoapContext<OrderQueryRequest, OrderQueryResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Order.ORDER_QUERY, request, config, soapClient, context, OrderQueryResponse.class);
    }

    /**
     * 取消订单（必接）
     * Order_Change_Pro
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<OrderChangeProResponse> orderChangePro(OrderChangeProRequest request) {
        SoapContext<OrderChangeProRequest, OrderChangeProResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Order.ORDER_CHANGE_PRO, request, config, soapClient, context, OrderChangeProResponse.class);
    }

    /**
     * 重发短信 （可选）
     * reSend_SMS_Global_PL
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<ReSendSMSGlobalPLResponse> reSendSMSGlobalPL(ReSendSMSGlobalPLRequest request) {
        SoapContext<ReSendSMSGlobalPLRequest, ReSendSMSGlobalPLResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Order.RESEND_SMS_GLOBAL_PL, request, config, soapClient, context, ReSendSMSGlobalPLResponse.class);
    }

    /**
     * 人脸绑定订单 （可选）
     * Order_Bind_Face
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<OrderBindFaceResponse> orderBindFace(OrderBindFaceRequest request) {
        SoapContext<OrderBindFaceRequest, OrderBindFaceResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Order.ORDER_BIND_FACE, request, config, soapClient, context, OrderBindFaceResponse.class);
    }

    /**
     * 人脸订单更新绑定 （可选）
     * Order_Rebind_Face
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<OrderRebindFaceResponse> orderRebindFace(OrderRebindFaceRequest request) {
        SoapContext<OrderRebindFaceRequest, OrderRebindFaceResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Order.ORDER_REBIND_FACE, request, config, soapClient, context, OrderRebindFaceResponse.class);
    }

    /**
     * 订单查询人脸绑定信息 （可选）
     * Order_Get_Face
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<OrderGetFaceResponse> orderGetFace(OrderGetFaceRequest request) {
        SoapContext<OrderGetFaceRequest, OrderGetFaceResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Order.ORDER_GET_FACE, request, config, soapClient, context, OrderGetFaceResponse.class);
    }

    /**
     * 指定门票退票 （可选）
     * Order_Change_By_Code
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<OrderChangeByCodeResponse> orderChangeByCode(OrderChangeByCodeRequest request) {
        SoapContext<OrderChangeByCodeRequest, OrderChangeByCodeResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Order.ORDER_CHANGE_BY_CODE, request, config, soapClient, context, OrderChangeByCodeResponse.class);
    }

    /**
     * 供应商强制退（可选）
     * Order_Change_Force
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<OrderChangeForceResponse> orderChangeForce(OrderChangeForceRequest request) {
        SoapContext<OrderChangeForceRequest, OrderChangeForceResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Order.ORDER_CHANGE_FORCE, request, config, soapClient, context, OrderChangeForceResponse.class);
    }
}
