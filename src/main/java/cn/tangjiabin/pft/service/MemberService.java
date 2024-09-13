package cn.tangjiabin.pft.service;

import cn.tangjiabin.pft.model.request.member.*;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.member.*;


/**
 * 会员相关服务
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public interface MemberService extends BaseService{

    /**
     * 会员关系查看 （可选）
     * PFT_Member_Relationship
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<PFTMemberRelationshipResponse> pftMemberRelationship(PFTMemberRelationshipRequest request);

    /**
     * 资金余额查看（可选）
     * PFT_Member_Fund
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<PFTMemberFundResponse> pftMemberFund(PFTMemberFundRequest request);

    /**
     * 结算方式查看 （可选）
     * Member_Settlement
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Data<MemberSettlementResponse> memberSettlement(MemberSettlementRequest request);

}
