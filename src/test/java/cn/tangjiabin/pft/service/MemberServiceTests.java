package cn.tangjiabin.pft.service;

import cn.tangjiabin.pft.PFTFactory;
import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.model.request.member.MemberSettlementRequest;
import cn.tangjiabin.pft.model.request.member.PFTMemberFundRequest;
import cn.tangjiabin.pft.model.request.member.PFTMemberRelationshipRequest;
import cn.tangjiabin.pft.model.response.Data;
import cn.tangjiabin.pft.model.response.member.MemberSettlementResponse;
import cn.tangjiabin.pft.model.response.member.PFTMemberFundResponse;
import cn.tangjiabin.pft.model.response.member.PFTMemberRelationshipResponse;

/**
 * 会员相关测试
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-13
 */


public class MemberServiceTests {

    public static void main(String[] args) {
        System.out.println("MemberServiceTests");

        // 创建票付通配置
        PFTConfig pftConfig = new PFTConfig();
        pftConfig.setUrl("http://open.12301dev.com/openService/pftMX.php");
        pftConfig.setAc("xxxxxx");
        pftConfig.setPw("xxxxxx");

        // 创建票付通工厂
        PFTFactory pftFactory = new PFTFactory(pftConfig);
        MemberService memberService = pftFactory.getMemberService();

        // 会员关系查看 （可选）
        pftMemberRelationship(memberService);

        // 资金余额查看（可选）
        pftMemberFund(memberService);

        // 结算方式查看 （可选）
        memberSettlement(memberService);
    }

    private static void pftMemberRelationship(MemberService memberService) {
        PFTMemberRelationshipRequest request = new PFTMemberRelationshipRequest();
        request.setN("3");
        request.setM("1");

        Data<PFTMemberRelationshipResponse> responseData = memberService.pftMemberRelationship(request);

        System.out.println("会员关系查看：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }
    }

    private static void pftMemberFund(MemberService memberService) {
        PFTMemberFundRequest request = new PFTMemberFundRequest();
        request.setDtype("0");
        request.setAid("");

        Data<PFTMemberFundResponse> responseData = memberService.pftMemberFund(request);

        System.out.println("资金余额查看：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }

    }

    private static void memberSettlement(MemberService memberService) {
        MemberSettlementRequest request = new MemberSettlementRequest();
        request.setSid("");

        Data<MemberSettlementResponse> responseData = memberService.memberSettlement(request);

        System.out.println("结算方式查看：" + responseData.getSuccess());
        if (responseData.getSuccess()) {
            responseData.getRec().forEach(System.out::println);
        } else {
            System.out.println("错误代码：" + responseData.getUUerrorcode());
            System.out.println("错误信息：" + responseData.getUUerrorinfo());
        }

    }
}
