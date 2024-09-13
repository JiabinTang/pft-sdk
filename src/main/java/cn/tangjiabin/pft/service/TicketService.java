package cn.tangjiabin.pft.service;

import cn.tangjiabin.pft.model.request.ticket.*;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.ticket.*;


/**
 * 门票相关服务
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public interface TicketService extends BaseService{

    /**
     * 获取门票列表
     * Get_Ticket_List
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<TicketListResponse> getTicketList(TicketListRequest request);

    /**
     * 日历价格库存（可选）
     * GetRealTimeStorage
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<RealTimeStorageResponse> getRealTimeStorage(RealTimeStorageRequest request);

    /**
     * 分时价格库存（可选）
     * Time_Share_Price_And_Storage
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<TimeSharePriceAndStorageResponse> timeSharePriceAndStorage(TimeSharePriceAndStorageRequest request);

    /**
     * 场次信息（演出产品类型；可选）
     * Get_Screenings_List
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<ScreeningsListResponse> getScreeningsList(ScreeningsListRequest request);
}
