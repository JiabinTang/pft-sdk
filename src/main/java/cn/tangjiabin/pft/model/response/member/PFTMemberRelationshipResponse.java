package cn.tangjiabin.pft.model.response.member;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class PFTMemberRelationshipResponse {

    /** 账号名称 */
    private String UUdname;

    /** 地址 */
    private String UUaddress;

    /** QQ */
    private String UUqq;

    /** 联系人名称 */
    private String UUcname;

    /** 联系人手机号 */
    private String UUctel;

    /** 会员 id */
    private String UUmid;

    /** 供应商设置的结算价类型, 0-不限 1-授信 2-余额 ,n =2 返回该值 */
    private String UUsettlement_mode;

    public String getUUdname() {
        return UUdname;
    }

    public void setUUdname(String UUdname) {
        this.UUdname = UUdname;
    }

    public String getUUaddress() {
        return UUaddress;
    }

    public void setUUaddress(String UUaddress) {
        this.UUaddress = UUaddress;
    }

    public String getUUqq() {
        return UUqq;
    }

    public void setUUqq(String UUqq) {
        this.UUqq = UUqq;
    }

    public String getUUcname() {
        return UUcname;
    }

    public void setUUcname(String UUcname) {
        this.UUcname = UUcname;
    }

    public String getUUctel() {
        return UUctel;
    }

    public void setUUctel(String UUctel) {
        this.UUctel = UUctel;
    }

    public String getUUmid() {
        return UUmid;
    }

    public void setUUmid(String UUmid) {
        this.UUmid = UUmid;
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
                "\"UUdname\":\"" + UUdname + "\"" +
                ", \"UUaddress\":\"" + UUaddress + "\"" +
                ", \"UUqq\":\"" + UUqq + "\"" +
                ", \"UUcname\":\"" + UUcname + "\"" +
                ", \"UUctel\":\"" + UUctel + "\"" +
                ", \"UUmid\":\"" + UUmid + "\"" +
                ", \"UUsettlement_mode\":\"" + UUsettlement_mode + "\"" +
                "}";
    }
}
