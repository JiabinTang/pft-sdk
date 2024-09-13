package cn.tangjiabin.pft.model.response.member;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class PFTMemberFundResponse {

    /**
     * 账号余额, 单位：分，查询类型为 0 时有此参数
     */
    private String UUamoney;

    /**
     * 已用供应商授信额度, 单位：分，查询类型为 1 时有此参数
     */
    private String UUkmoney;

    /**
     * 供应商授信总额度, 单位：分，查询类型为 2 时有此参数
     */
    private String UUbasecredit;

    public String getUUamoney() {
        return UUamoney;
    }

    public void setUUamoney(String UUamoney) {
        this.UUamoney = UUamoney;
    }

    public String getUUkmoney() {
        return UUkmoney;
    }

    public void setUUkmoney(String UUkmoney) {
        this.UUkmoney = UUkmoney;
    }

    public String getUUbasecredit() {
        return UUbasecredit;
    }

    public void setUUbasecredit(String UUbasecredit) {
        this.UUbasecredit = UUbasecredit;
    }

    @Override
    public String toString() {
        return "{" +
                "\"UUamoney\":\"" + UUamoney + "\"" +
                ", \"UUkmoney\":\"" + UUkmoney + "\"" +
                ", \"UUbasecredit\":\"" + UUbasecredit + "\"" +
                "}";
    }
}
