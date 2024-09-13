package cn.tangjiabin.pft.model.request.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderSubmitRequest {

    /** 产品 id, 对应 Get_Ticket_List.UUlid */
    private String lid;

    /** 门票 id, 对应 Get_Ticket_List.UUid */
    private String tid;

    /** 远端订单号, 贵方订单号, 请确保唯一，最大长度20 */
    private String remotenum;

    /** 结算价, 供应商配置的结算单价，单位：分 */
    private String tprice;

    /** 购买数量 */
    private String tnum;

    /** 游玩日期, 格式：yyyy-mm-dd, 为分时预约产品时，playtime 格式为：yyyy-mm-dd hh:mm。hh:mm 值为分时价格库存方法返回的 start_time 参数。套票都需要传游玩日期。子票无需选择游玩日期的，默认传今天的游玩日期 */
    private String playtime;

    /** 游客姓名, 多个用英文逗号隔开，不支持特殊符号：/|[]等，与身份证对应 */
    private String ordername;

    /** 取票人（联系人）手机号, 不超过 16 位 ，手机号只填一个 */
    private String ordertel;

    /** 游玩人手机号, 多个用英文逗号隔开，不支持特殊符号：/|[]等，与身份证对应 */
    private String contactTEL;

    /** 是否选择票付通发送短信, 0 -票付通发送短信 1-票付通不发短信（前提是票属性上有勾选下单成功发短信给游客） */
    private String smsSend;

    /** 支付方式, 0-账户余额，2-供应商授信额度 */
    private String paymode;

    /** 下单方式, 默认传输 0-正常下单 */
    private String ordermode;

    /** 集合地点, 线路时需要，参数必传，值可传输空 */
    private String assembly;

    /** 团号, 线路，演出时需要，参数必传，值可传输空；演出需要时传输格式：json_encode(array(int)场馆 id,(int)场次 id,(string)分区 id)) */
    private String series;

    /** 联票 id, （未开放，请填 0） */
    private String concatID;

    /** 套票 id, （未开放，请填 0） */
    private String pCode;

    /** 供应商 id, 对应 Get_Ticket_List.UUaid */
    private String m;

    /** 身份证号, 多个用英文逗号隔开，不支持特殊符号：/|[]等 其他证件类型：证件号 + : + 类型 （eg : G12323:2 多个还是 , 分割）1=身份证, 2=护照, 3=军官证, 4=回乡证, 5=台胞证, 6=外国人永久居留证,7=港澳通行证,8=台湾通行证,9=港澳居民居住证,10=台湾居民居住证,99=其他 */
    private String personID;

    /** 备注, 参数必传，值可为空传输 */
    private String memo;

    /** 核销/退票回调地址, 参数必传，值可为空传输, eg： 1.订单状态：http://xxxxxxx， 2.订单状态(callBackUrl)+出票(callBackTicketUrl) 回调地址（json 数据）: {"callBackTicketUrl":"http://xx","callBackUrl":"htxxxx"} */
    private String callbackUrl;

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getRemotenum() {
        return remotenum;
    }

    public void setRemotenum(String remotenum) {
        this.remotenum = remotenum;
    }

    public String getTprice() {
        return tprice;
    }

    public void setTprice(String tprice) {
        this.tprice = tprice;
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

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getOrdertel() {
        return ordertel;
    }

    public void setOrdertel(String ordertel) {
        this.ordertel = ordertel;
    }

    public String getContactTEL() {
        return contactTEL;
    }

    public void setContactTEL(String contactTEL) {
        this.contactTEL = contactTEL;
    }

    public String getSmsSend() {
        return smsSend;
    }

    public void setSmsSend(String smsSend) {
        this.smsSend = smsSend;
    }

    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode;
    }

    public String getOrdermode() {
        return ordermode;
    }

    public void setOrdermode(String ordermode) {
        this.ordermode = ordermode;
    }

    public String getAssembly() {
        return assembly;
    }

    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getConcatID() {
        return concatID;
    }

    public void setConcatID(String concatID) {
        this.concatID = concatID;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    @Override
    public String toString() {
        return "{" +
                "lid='" + lid + '\'' +
                ", tid='" + tid + '\'' +
                ", remotenum='" + remotenum + '\'' +
                ", tprice='" + tprice + '\'' +
                ", tnum='" + tnum + '\'' +
                ", playtime='" + playtime + '\'' +
                ", ordername='" + ordername + '\'' +
                ", ordertel='" + ordertel + '\'' +
                ", contactTEL='" + contactTEL + '\'' +
                ", smsSend='" + smsSend + '\'' +
                ", paymode='" + paymode + '\'' +
                ", ordermode='" + ordermode + '\'' +
                ", assembly='" + assembly + '\'' +
                ", series='" + series + '\'' +
                ", concatID='" + concatID + '\'' +
                ", pCode='" + pCode + '\'' +
                ", m='" + m + '\'' +
                ", personID='" + personID + '\'' +
                ", memo='" + memo + '\'' +
                ", callbackUrl='" + callbackUrl + '\'' +
                '}';
    }
}
