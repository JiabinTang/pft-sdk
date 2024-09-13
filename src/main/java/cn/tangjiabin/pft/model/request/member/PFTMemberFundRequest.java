package cn.tangjiabin.pft.model.request.member;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class PFTMemberFundRequest {

    /**
     * 查询类型, 0-自己账户余额 1-已用供应商授信额度 2-供应商授信总额度
     */
    private String dtype;

    /**
     * 供应商 id
     */
    private String aid;

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "{" +
                "\"dtype\":\"" + dtype + "\"" +
                ", \"aid\":\"" + aid + "\"" +
                "}";
    }
}
