package cn.tangjiabin.pft.service;

import cn.tangjiabin.pft.PFTFactory;
import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.model.request.scenicspot.AreaCodeListRequest;
import cn.tangjiabin.pft.model.request.scenicspot.ScenicSpotInfoRequest;
import cn.tangjiabin.pft.model.request.scenicspot.ScenicSpotListRequest;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.scenicspot.AreaCodeListResponse;
import cn.tangjiabin.pft.model.response.scenicspot.ScenicSpotInfoResponse;
import cn.tangjiabin.pft.model.response.scenicspot.ScenicSpotListResponse;

/**
 * 产品相关测试
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class ScenicSpotServiceTests {


    public static void main(String[] args) {
        System.out.println("ScenicSpotServiceTest");

        // 创建票付通配置
        PFTConfig pftConfig = new PFTConfig();
        pftConfig.setUrl("http://open.12301dev.com/openService/pftMX.php");
        pftConfig.setAc("xxxxxx");
        pftConfig.setPw("xxxxxx");

        // 创建票付通工厂
        PFTFactory pftFactory = new PFTFactory(pftConfig);
        ScenicSpotService scenicSpotService = pftFactory.getScenicSpotService();

        // 创建产品列表请求
        scenicSpotList(scenicSpotService);

        // 创建产品详情请求
        scenicSpotInfo(scenicSpotService);

        // 创建地区编码列表请求
        areaCodeList(scenicSpotService);

    }

    private static void areaCodeList(ScenicSpotService scenicSpotService) {
        AreaCodeListRequest request = new AreaCodeListRequest();
        request.setPage("1");
        request.setPageNum("10");
        Data<AreaCodeListResponse> responseData = scenicSpotService.getAreaCodeList(request);

        System.out.println("地区编码列表：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码："+responseData.getUUerrorcode());
            System.out.println("错误信息："+responseData.getUUerrorinfo());
        }
    }

    private static void scenicSpotInfo(ScenicSpotService scenicSpotService) {
        ScenicSpotInfoRequest request = new ScenicSpotInfoRequest();
        request.setN("158575");
        Data<ScenicSpotInfoResponse> responseData = scenicSpotService.getScenicSpotInfo(request);

        System.out.println("产品详情：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码："+responseData.getUUerrorcode());
            System.out.println("错误信息："+responseData.getUUerrorinfo());
        }
    }

    private static void scenicSpotList(ScenicSpotService scenicSpotService) {
        ScenicSpotListRequest request = new ScenicSpotListRequest();
        request.setN("0");
        request.setM("100");
        Data<ScenicSpotListResponse> responseData = scenicSpotService.getScenicSpotList(request);

        System.out.println("产品列表：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码："+responseData.getUUerrorcode());
            System.out.println("错误信息："+responseData.getUUerrorinfo());
        }
    }
}
