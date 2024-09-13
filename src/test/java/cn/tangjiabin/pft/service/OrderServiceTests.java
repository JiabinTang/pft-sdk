package cn.tangjiabin.pft.service;

import cn.tangjiabin.pft.PFTFactory;
import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.model.request.order.OrderBindFaceRequest;
import cn.tangjiabin.pft.model.request.order.OrderChangeByCodeRequest;
import cn.tangjiabin.pft.model.request.order.OrderChangeForceRequest;
import cn.tangjiabin.pft.model.request.order.OrderChangeProRequest;
import cn.tangjiabin.pft.model.request.order.OrderGetFaceRequest;
import cn.tangjiabin.pft.model.request.order.OrderPreCheckRequest;
import cn.tangjiabin.pft.model.request.order.OrderQueryRequest;
import cn.tangjiabin.pft.model.request.order.OrderRebindFaceRequest;
import cn.tangjiabin.pft.model.request.order.OrderSubmitRequest;
import cn.tangjiabin.pft.model.request.order.ReSendSMSGlobalPLRequest;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.order.OrderBindFaceResponse;
import cn.tangjiabin.pft.model.response.order.OrderChangeByCodeResponse;
import cn.tangjiabin.pft.model.response.order.OrderChangeForceResponse;
import cn.tangjiabin.pft.model.response.order.OrderChangeProResponse;
import cn.tangjiabin.pft.model.response.order.OrderGetFaceResponse;
import cn.tangjiabin.pft.model.response.order.OrderPreCheckResponse;
import cn.tangjiabin.pft.model.response.order.OrderQueryResponse;
import cn.tangjiabin.pft.model.response.order.OrderRebindFaceResponse;
import cn.tangjiabin.pft.model.response.order.OrderSubmitResponse;
import cn.tangjiabin.pft.model.response.order.ReSendSMSGlobalPLResponse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * 订单测试
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-13
 */

public class OrderServiceTests {

    public static void main(String[] args) {
        System.out.println("OrderServiceTests");

        // 创建票付通配置
        PFTConfig pftConfig = new PFTConfig();
        pftConfig.setUrl("http://open.12301dev.com/openService/pftMX.php");
        pftConfig.setAc("xxxxxx");
        pftConfig.setPw("xxxxxx");

        // 创建票付通工厂
        PFTFactory pftFactory = new PFTFactory(pftConfig);
        OrderService orderService = pftFactory.getOrderService();


        // 预判下单 （判断提交的参数是否满足下单条件，没有生成订单；可选）
        orderPreCheck(orderService);

        // 提交订单 （已支付订单提交，必接）
        orderSubmit(orderService);

        // 查询订单（可选）
        orderQuery(orderService);

        // 取消订单（必接）
        orderChangePro(orderService);

        // 重发短信 （可选）
        reSendSMSGlobalPL(orderService);

        // 人脸绑定订单 （可选）
        orderBindFace(orderService);

        // 人脸订单更新绑定 （可选）
        orderRebindFace(orderService);

        // 订单查询人脸绑定信息 （可选）
        orderGetFace(orderService);

        // 指定门票退票 （可选）
        orderChangeByCode(orderService);

        // 供应商强制退（可选）
        orderChangeForce(orderService);

    }

    private static void orderPreCheck(OrderService orderService) {
        OrderPreCheckRequest request = new OrderPreCheckRequest();
        request.setTid("514229");
        request.setTnum("1");
        request.setPlaytime("2024-09-14");
        request.setOrdertel("12345679898");
        request.setOrdername("取票人姓名");
        request.setM("3274420");
        request.setPaymode("0");
        request.setPersonid("");
        request.setTprice("10000");

        Data<OrderPreCheckResponse> responseData = orderService.orderPreCheck(request);

        System.out.println("预判下单：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }
    }

    private static void orderSubmit(OrderService orderService) {
        LocalDate now = LocalDate.now();
        OrderSubmitRequest request = new OrderSubmitRequest();
        request.setLid("158579");
        request.setTid("514151");
        request.setRemotenum(String.valueOf(System.currentTimeMillis()));
        request.setTprice("20000");
        request.setTnum("3");
        request.setPlaytime(now.format(DateTimeFormatter.ISO_DATE));
        request.setOrdername("游客1,游客2,游客3");
        request.setOrdertel("18301221126");
        request.setContactTEL("18301221126,18301221126,18301221126");
        request.setSmsSend("1");
        request.setPaymode("0");
        request.setOrdermode("0");
        request.setAssembly("");
        request.setSeries("");
        request.setConcatID("0");
        request.setpCode("0");
        request.setM("3274420");
        request.setPersonID("110150199909191810,110150199909191829,110150199909191837");
        request.setMemo("");
        request.setCallbackUrl("");

        Data<OrderSubmitResponse> responseData = orderService.orderSubmit(request);

        System.out.println("提交订单：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }

    }

    private static void orderQuery(OrderService orderService) {
        OrderQueryRequest request = new OrderQueryRequest();
        request.setPftOrdernum("72620908315267");
        request.setRemoteOrdernum("1726209082014");
        Data<OrderQueryResponse> responseData = orderService.orderQuery(request);

        System.out.println("查询订单：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }

    }

    private static void orderChangePro(OrderService orderService) {
        OrderChangeProRequest request = new OrderChangeProRequest();

        Data<OrderChangeProResponse> responseData = orderService.orderChangePro(request);

        System.out.println("取消订单：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }

    }

    private static void reSendSMSGlobalPL(OrderService orderService) {
        ReSendSMSGlobalPLRequest request = new ReSendSMSGlobalPLRequest();
        request.setOrdern("72620908315267");

        Data<ReSendSMSGlobalPLResponse> responseData = orderService.reSendSMSGlobalPL(request);

        System.out.println("重发短信：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }

    }

    private static void orderBindFace(OrderService orderService) {
        OrderBindFaceRequest request = new OrderBindFaceRequest();
        request.setPftOrder("72620908315267");
        request.setFaceImgUrl("https://img.picui.cn/free/2024/09/13/66e3e5148671d.jpg");
        request.setIdx("1");
        request.setIdcard("110150199909191810");
        request.setMobile("18301221126");
        request.setFaceName("游客1");

        Data<OrderBindFaceResponse> responseData = orderService.orderBindFace(request);

        System.out.println("人脸绑定订单：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }

    }

    private static void orderRebindFace(OrderService orderService) {
        OrderRebindFaceRequest request = new OrderRebindFaceRequest();
        request.setPftOrder("72620908315267");
        request.setFaceImgUrl("https://img.picui.cn/free/2024/09/13/66e3e5148671d.jpg");
        request.setIdx("1");
        request.setFaceName("游客1");

        Data<OrderRebindFaceResponse> responseData = orderService.orderRebindFace(request);

        System.out.println("人脸订单更新绑定：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }

    }

    private static void orderGetFace(OrderService orderService) {
        OrderGetFaceRequest request = new OrderGetFaceRequest();
        request.setPftOrder("72620908315267");

        Data<OrderGetFaceResponse> responseData = orderService.orderGetFace(request);

        System.out.println("订单查询人脸绑定信息：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }

    }

    private static void orderChangeByCode(OrderService orderService) {
        OrderChangeByCodeRequest request = new OrderChangeByCodeRequest();
        request.setReqSerialNumber("2024091312345678");
        request.setOrdern("72620908315267");
        request.setChangeByType("certificate");
        request.setCertificateNumbers("110150199909191810");
        request.setCertificateTypes("1");
        request.setCheckCodes("");

        Data<OrderChangeByCodeResponse> responseData = orderService.orderChangeByCode(request);

        System.out.println("指定门票退票：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }

    }

    private static void orderChangeForce(OrderService orderService) {
        OrderChangeForceRequest request = new OrderChangeForceRequest();
        request.setReqSerialNumber("2024091312345678");
        request.setOrdern("72620908315267");

        Data<OrderChangeForceResponse> responseData = orderService.orderChangeForce(request);

        System.out.println("供应商强制退：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());

        }
    }

    private static String generateId() {
        int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        String[] checkCode = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 17; i++) {
            sb.append(random.nextInt(10));
        }

        int sum = 0;
        for (int i = 0; i < 17; i++) {
            sum += (sb.charAt(i) - '0') * weight[i];
        }
        int mod = sum % 11;

        return sb.append(checkCode[mod]).toString();
    }
}