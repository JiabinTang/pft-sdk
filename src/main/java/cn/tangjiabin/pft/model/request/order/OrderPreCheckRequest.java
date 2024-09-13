package cn.tangjiabin.pft.model.request.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderPreCheckRequest {

    /**
     * 门票 id, 对应 Get_Ticket_List.UUid
     */
    private String tid;

    /**
     * 购买数量
     */
    private String tnum;

    /**
     * 游玩日期, 格式：Y-m-d, 为分时预约产品时，格式为：Y-m-d hh:mm，hh:mm 值为分时价格库存方法返回的 start_date 参数。套票都需要传游玩日期。子票无需选择游玩日期的，默认传今天的游玩日期
     */
    private String playtime;

    /**
     * 取票人手机号
     */
    private String ordertel;

    /**
     * 游客姓名, 多个用英文逗号隔开，不支持特殊符号：/|[]等
     */
    private String ordername;

    /**
     * 供应商 id, 对应 Get_Ticket_List.UUaid
     */
    private String m;

    /**
     * 支付方式, 0-账户余额，2-供应商授信额度，取决于分销商和供应商的合作方式，与用户的支付方式无关
     */
    private String paymode;

    /**
     * 游客身份证, 多个用英文逗号隔开，与游客姓名数量一致。其他证件类型：证件号 + : + 类型 （eg : G12323:2 多个还是 , 分割）1=身份证, 2=护照, 3=军官证, 4=回乡证, 5=台胞证, 6=外国人永久居留证,7=港澳通行证,8=台湾通行证,9=港澳居民居住证,10=台湾居民居住证,99=其他
     */
    private String personid;

    /**
     * 结算价, 供应商配置的结算单价，单位：分, 对应 GetRealTimeStorage.buy_price
     */
    private String tprice;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTnum() {
        return tnum;
    }

    public void setTnum(String tnum) {
        this.tnum = tnum;
    }

    public String getPlaytime() {
        return playtime;
    }

    public void setPlaytime(String playtime) {
        this.playtime = playtime;
    }

    public String getOrdertel() {
        return ordertel;
    }

    public void setOrdertel(String ordertel) {
        this.ordertel = ordertel;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getTprice() {
        return tprice;
    }

    public void setTprice(String tprice) {
        this.tprice = tprice;
    }

    @Override
    public String toString() {
        return "{" +
                "\"tid\":\"" + tid + "\"," +
                "\"tnum\":\"" + tnum + "\"," +
                "\"playtime\":\"" + playtime + "\"," +
                "\"ordertel\":\"" + ordertel + "\"," +
                "\"ordername\":\"" + ordername + "\"," +
                "\"m\":\"" + m + "\"," +
                "\"paymode\":\"" + paymode + "\"," +
                "\"personid\":\"" + personid + "\"," +
                "\"tprice\":\"" + tprice + "\"" +
                "}";
    }
}
