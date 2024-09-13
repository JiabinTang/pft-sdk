package cn.tangjiabin.pft.service.impl;

import cn.tangjiabin.pft.client.SoapClient;
import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.config.PFTMethods;
import cn.tangjiabin.pft.model.request.ticket.*;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.ticket.*;
import cn.tangjiabin.pft.service.TicketService;
import cn.tangjiabin.pft.soap.SoapContext;
import cn.tangjiabin.pft.soap.strategy.DefaultSoapStrategy;


/**
 * 门票相关服务
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class TicketServiceImpl implements TicketService {

    protected SoapClient soapClient;
    protected PFTConfig config;

    public TicketServiceImpl(PFTConfig config) {
        this.config = config;
        this.soapClient = SoapClient.getInstance(config);
    }

    /**
     * 获取门票列表
     * Get_Ticket_List
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<TicketListResponse> getTicketList(TicketListRequest request) {
        SoapContext<TicketListRequest, TicketListResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Ticket.GET_TICKET_LIST, request, config, soapClient, context, TicketListResponse.class);
    }

    /**
     * 日历价格库存（可选）
     * GetRealTimeStorage
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<RealTimeStorageResponse> getRealTimeStorage(RealTimeStorageRequest request) {
        SoapContext<RealTimeStorageRequest, RealTimeStorageResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Ticket.GET_REAL_TIME_STORAGE, request, config, soapClient, context, RealTimeStorageResponse.class);
    }

    /**
     * 分时价格库存（可选）
     * Time_Share_Price_And_Storage
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<TimeSharePriceAndStorageResponse> timeSharePriceAndStorage(TimeSharePriceAndStorageRequest request) {
        SoapContext<TimeSharePriceAndStorageRequest, TimeSharePriceAndStorageResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Ticket.TIME_SHARE_PRICE_AND_STORAGE, request, config, soapClient, context, TimeSharePriceAndStorageResponse.class);
    }

    /**
     * 场次信息（演出产品类型；可选）
     * Get_Screenings_List
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<ScreeningsListResponse> getScreeningsList(ScreeningsListRequest request) {
        SoapContext<ScreeningsListRequest, ScreeningsListResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Ticket.GET_SCREENINGS_LIST, request, config, soapClient, context, ScreeningsListResponse.class);
    }
}
