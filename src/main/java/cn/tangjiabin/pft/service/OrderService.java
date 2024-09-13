package cn.tangjiabin.pft.service;

import cn.tangjiabin.pft.model.request.order.*;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.order.*;


/**
 * 订单相关服务
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public interface OrderService extends BaseService {

    /**
     * 预判下单 （判断提交的参数是否满足下单条件，没有生成订单；可选）
     * OrderPreCheck
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<OrderPreCheckResponse> orderPreCheck(OrderPreCheckRequest request);

    /**
     * 提交订单 （已支付订单提交，必接）
     * PFT_Order_Submit
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<OrderSubmitResponse> orderSubmit(OrderSubmitRequest request);

    /**
     * 查询订单（可选）
     * OrderQuery
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<OrderQueryResponse> orderQuery(OrderQueryRequest request);

    /**
     * 取消订单（必接）
     * Order_Change_Pro
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<OrderChangeProResponse> orderChangePro(OrderChangeProRequest request);

    /**
     * 重发短信 （可选）
     * reSend_SMS_Global_PL
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<ReSendSMSGlobalPLResponse> reSendSMSGlobalPL(ReSendSMSGlobalPLRequest request);

    /**
     * 人脸绑定订单 （可选）
     * Order_Bind_Face
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<OrderBindFaceResponse> orderBindFace(OrderBindFaceRequest request);

    /**
     * 人脸订单更新绑定 （可选）
     * Order_Rebind_Face
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<OrderRebindFaceResponse> orderRebindFace(OrderRebindFaceRequest request);

    /**
     * 订单查询人脸绑定信息 （可选）
     * Order_Get_Face
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<OrderGetFaceResponse> orderGetFace(OrderGetFaceRequest request);

    /**
     * 指定门票退票 （可选）
     * Order_Change_By_Code
     *
     * <p>无身份证/身份证错误/身份证未查询到，退票失败</p>
     * <p>同一笔订单多次退（同一笔订单中，同一个信息或同一条流水多次退）：通过流水号做区分；</p>
     * <p>使用“指定门票退票”接口进行退票时，暂不支持票属性配置“一票种一张票”的订单；对接时请仔细确认商家配置；若如此操作，将会出现异常退票情况；</p>
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<OrderChangeByCodeResponse> orderChangeByCode(OrderChangeByCodeRequest request);

    /**
     * 供应商强制退（可选）
     * Order_Change_Force
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<OrderChangeForceResponse> orderChangeForce(OrderChangeForceRequest request);

}
