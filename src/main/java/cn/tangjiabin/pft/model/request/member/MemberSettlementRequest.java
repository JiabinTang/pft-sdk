package cn.tangjiabin.pft.model.request.member;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class MemberSettlementRequest {

    /**
     * 供应商Id
     */
    private String sid;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "{" +
                "\"sid\":\"" + sid + "\"" +
                "}";
    }
}
