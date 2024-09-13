package cn.tangjiabin.pft.service;

import cn.tangjiabin.pft.model.request.scenicspot.*;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.scenicspot.*;


/**
 * 产品相关服务
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public interface ScenicSpotService extends BaseService {

    /**
     * 获取产品列表
     * Get_ScenicSpot_List
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<ScenicSpotListResponse> getScenicSpotList(ScenicSpotListRequest request);

    /**
     * 获取产品详情
     * Get_ScenicSpot_Info
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<ScenicSpotInfoResponse> getScenicSpotInfo(ScenicSpotInfoRequest request);

    /**
     * 获取区域列表
     * Get_Area_Code_List
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<AreaCodeListResponse> getAreaCodeList(AreaCodeListRequest request);

}
