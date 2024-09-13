package cn.tangjiabin.pft.service.impl;

import cn.tangjiabin.pft.client.SoapClient;
import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.config.PFTMethods;
import cn.tangjiabin.pft.model.request.scenicspot.*;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.scenicspot.*;
import cn.tangjiabin.pft.service.ScenicSpotService;
import cn.tangjiabin.pft.soap.SoapContext;
import cn.tangjiabin.pft.soap.strategy.DefaultSoapStrategy;


/**
 * 产品服务相关实现
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */

public class ScenicSpotServiceImpl implements ScenicSpotService {

    protected SoapClient soapClient;
    protected PFTConfig config;

    public ScenicSpotServiceImpl(PFTConfig config) {
        this.config = config;
        this.soapClient = SoapClient.getInstance(config);
    }

    /**
     * 获取产品列表
     * Get_ScenicSpot_List
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<ScenicSpotListResponse> getScenicSpotList(ScenicSpotListRequest request) {
        SoapContext<ScenicSpotListRequest, ScenicSpotListResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.ScenicSpot.GET_SCENIC_SPOT_LIST, request, config, soapClient, context, ScenicSpotListResponse.class);
    }

    /**
     * 获取产品详情
     * Get_ScenicSpot_Info
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<ScenicSpotInfoResponse> getScenicSpotInfo(ScenicSpotInfoRequest request) {
        SoapContext<ScenicSpotInfoRequest, ScenicSpotInfoResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.ScenicSpot.GET_SCENIC_SPOT_INFO, request, config, soapClient, context, ScenicSpotInfoResponse.class);
    }

    /**
     * 获取区域列表
     * Get_Area_Code_List
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<AreaCodeListResponse> getAreaCodeList(AreaCodeListRequest request) {
        SoapContext<AreaCodeListRequest, AreaCodeListResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.ScenicSpot.GET_AREA_CODE_LIST, request, config, soapClient, context, AreaCodeListResponse.class);
    }


}
