package cn.tangjiabin.pft.service.impl;

import cn.tangjiabin.pft.client.SoapClient;
import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.config.PFTMethods;
import cn.tangjiabin.pft.model.request.member.*;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.member.*;
import cn.tangjiabin.pft.service.MemberService;
import cn.tangjiabin.pft.soap.SoapContext;
import cn.tangjiabin.pft.soap.strategy.DefaultSoapStrategy;

/**
 * 会员服务实现
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-13
 */


public class MemberServiceImpl implements MemberService {

    protected SoapClient soapClient;
    protected PFTConfig config;

    public MemberServiceImpl(PFTConfig config) {
        this.config = config;
        this.soapClient = SoapClient.getInstance(config);
    }

    /**
     * 会员关系查看 （可选）
     * PFT_Member_Relationship
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<PFTMemberRelationshipResponse> pftMemberRelationship(PFTMemberRelationshipRequest request) {
        SoapContext<PFTMemberRelationshipRequest, PFTMemberRelationshipResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Member.PFT_MEMBER_RELATIONSHIP, request, config, soapClient, context, PFTMemberRelationshipResponse.class);
    }

    /**
     * 资金余额查看（可选）
     * PFT_Member_Fund
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<PFTMemberFundResponse> pftMemberFund(PFTMemberFundRequest request) {
        SoapContext<PFTMemberFundRequest, PFTMemberFundResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Member.PFT_MEMBER_FUND, request, config, soapClient, context, PFTMemberFundResponse.class);
    }

    /**
     * 结算方式查看 （可选）
     * Member_Settlement
     *
     * @param request 请求参数
     * @return 返回结果
     */
    @Override
    public Data<MemberSettlementResponse> memberSettlement(MemberSettlementRequest request) {
        SoapContext<MemberSettlementRequest, MemberSettlementResponse> context = new SoapContext<>(new DefaultSoapStrategy<>());
        return processRequest(PFTMethods.Member.MEMBER_SETTLEMENT, request, config, soapClient, context, MemberSettlementResponse.class);
    }
}
