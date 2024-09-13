package cn.tangjiabin.pft.model.response.member;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class MemberSettlementResponse {

    /**
     * 供应商 id
     */
    private String UUsid;

    /**
     * 供应商设置的结算价类型, 0-不限 1-授信 2-余额 ，返回数据为空或重叠，原因是供应商没有配置结算方式，当做供应商设置不限处理
     */
    private String UUsettlement_mode;

    public String getUUsid() {
        return UUsid;
    }

    public void setUUsid(String UUsid) {
        this.UUsid = UUsid;
    }

    public String getUUsettlement_mode() {
        return UUsettlement_mode;
    }

    public void setUUsettlement_mode(String UUsettlement_mode) {
        this.UUsettlement_mode = UUsettlement_mode;
    }

    @Override
    public String toString() {
        return "{" +
                "\"UUsid\":\"" + UUsid + "\"" +
                ", \"UUsettlement_mode\":\"" + UUsettlement_mode + "\"" +
                "}";
    }
}
