package cn.tangjiabin.pft.service;

import cn.tangjiabin.pft.PFTFactory;
import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.model.request.ticket.RealTimeStorageRequest;
import cn.tangjiabin.pft.model.request.ticket.ScreeningsListRequest;
import cn.tangjiabin.pft.model.request.ticket.TicketListRequest;
import cn.tangjiabin.pft.model.request.ticket.TimeSharePriceAndStorageRequest;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.ticket.RealTimeStorageResponse;
import cn.tangjiabin.pft.model.response.ticket.ScreeningsListResponse;
import cn.tangjiabin.pft.model.response.ticket.TicketListResponse;
import cn.tangjiabin.pft.model.response.ticket.TimeSharePriceAndStorageResponse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 门票测试
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class TicketServiceTests {


    public static void main(String[] args) {
        System.out.println("TicketServiceTests");

        // 创建票付通配置
        PFTConfig pftConfig = new PFTConfig();
        pftConfig.setUrl("http://open.12301dev.com/openService/pftMX.php");
        pftConfig.setAc("xxxxxx");
        pftConfig.setPw("xxxxxx");

        // 创建票付通工厂
        PFTFactory pftFactory = new PFTFactory(pftConfig);
        TicketService ticketService = pftFactory.getTicketService();

        // 获取门票列表
        getTicketList(ticketService);

        // 日历价格库存
        realTimeStorage(ticketService);

        // 分时价格库存
        timeSharePriceAndStorage(ticketService);

        // 场次信息
        getScreeningsList(ticketService);
    }


    private static void getTicketList(TicketService ticketService) {
        TicketListRequest request = new TicketListRequest();
        request.setN("158579");
        request.setM("");
        Data<TicketListResponse> responseData = ticketService.getTicketList(request);

        System.out.println("门票列表：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码："+responseData.getUUerrorcode());
            System.out.println("错误信息："+responseData.getUUerrorinfo());
        }
    }

    private static void realTimeStorage(TicketService ticketService) {
        RealTimeStorageRequest request = new RealTimeStorageRequest();
        request.setAid("3274420");
        request.setPid("511261");
        LocalDate now = LocalDate.now();
        request.setStart_date(now.format(DateTimeFormatter.ISO_DATE));
        request.setEnd_date(now.plusDays(3).format(DateTimeFormatter.ISO_DATE));

        Data<RealTimeStorageResponse> responseData = ticketService.getRealTimeStorage(request);

        System.out.println("日历价格库存：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码："+responseData.getUUerrorcode());
            System.out.println("错误信息："+responseData.getUUerrorinfo());
        }
    }

    private static void timeSharePriceAndStorage(TicketService ticketService) {
        TimeSharePriceAndStorageRequest request = new TimeSharePriceAndStorageRequest();
        request.setAid("3274420");
        request.setTid("514151");
        LocalDate now = LocalDate.now();
        request.setStartDate(now.format(DateTimeFormatter.ISO_DATE));
        request.setEndDate(now.plusDays(3).format(DateTimeFormatter.ISO_DATE));

        Data<TimeSharePriceAndStorageResponse> responseData = ticketService.timeSharePriceAndStorage(request);

        System.out.println("分时价格库存：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码："+responseData.getUUerrorcode());
            System.out.println("错误信息："+responseData.getUUerrorinfo());
        }
    }

    private static void getScreeningsList(TicketService ticketService) {
        ScreeningsListRequest request = new ScreeningsListRequest();
        request.setAid("3274420");
        request.setTid("514230");
        LocalDate now = LocalDate.now();
        request.setDate(now.format(DateTimeFormatter.ISO_DATE));

        Data<ScreeningsListResponse> responseData = ticketService.getScreeningsList(request);

        System.out.println("场次信息：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码："+responseData.getUUerrorcode());
            System.out.println("错误信息："+responseData.getUUerrorinfo());
        }
    }
}
