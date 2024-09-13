package cn.tangjiabin.pft.model.response.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderQueryResponse {

    /**
     * 会员 id
     */
    private String UUmember;

    /**
     * 票付通订单号
     */
    private String UUordernum;

    /**
     * 远端订单号, 贵方订单号
     */
    private String UUremotenum;

    /**
     * 产品 id
     */
    private String UUlid;

    /**
     * 门票 id
     */
    private String UUtid;

    /**
     * 价格 id
     */
    private String UUpid;

    /**
     * 订单有效开始日期
     */
    private String UUbegintime;

    /**
     * 下单时间
     */
    private String UUordertime;

    /**
     * 订单有效结束日期
     */
    private String UUendtime;

    /**
     * 订单数量, 当前状态数量
     */
    private String UUtnum;

    /**
     * 订单结算价, 单位：分
     */
    private String UUtprice;

    /**
     * 游客姓名
     */
    private String UUordername;

    /**
     * 游客手机号
     */
    private String UUorderte;

    /**
     * 订单状态, 订单状态：0=未使用,1=已使用,2=已过期,3=被取消,4=待确认(酒店)，待收货(特产),5=被终端修改,6=被终端撤销,7=部分使用,8=订单完结,9=被删除,11=待出票
     */
    private String UUstatus;

    /**
     * 资源 id
     */
    private String UUsalerid;

    /**
     * 订单验证时间
     */
    private String UUdtime;

    /**
     * 订单总金额, 单位：分
     */
    private String UUtotalmoney;

    /**
     * 支付方式
     */
    private String UUpmode;

    /**
     * 下单方式
     */
    private String UUordermode;

    /**
     * 订单取消时间
     */
    private String UUctime;

    /**
     * 凭证码/消费码
     */
    private String UUcode;

    /**
     * 联系人手机号
     */
    private String UUcontacttel;

    /**
     * 供应商 id
     */
    private String UUaid;

    /**
     * 是否套票, 0-不是，1-是
     */
    private String UUifpack;

    /**
     * 套票订单号
     */
    private String UUpack_order;

    /**
     * 短信是否发送成功, 0-成功，1-失败
     */
    private String UUsmserror;

    /**
     * 订单原始数量
     */
    private String UUorigin_num;

    /**
     * 零售单价, 单位：分
     */
    private String UUlprice;

    /**
     * 游玩日期
     */
    private String UUplaytime;

    /**
     * 支付状态, 0-景区到付，1-已支付，2-未支付
     */
    private String UUpay_status;

    /**
     * 联票关联订单号
     */
    private String UUconcat_id;

    /**
     * 团号或者演出座位信息, json
     */
    private String UUseries;

    /**
     * 订单备注
     */
    private String UUmemo;

    /**
     * 产品名称
     */
    private String UUltitle;

    /**
     * 产品类型, A 景点 B 线路 C 酒店 F 套票 H 演出 其他类型无销售请无视
     */
    private String UUp_type;

    /**
     * 门票名称
     */
    private String UUttitle;

    /**
     * 门市价, 单位：元
     */
    private String UUMprice;

    /**
     * 分销商名称
     */
    private String UUdname;

    /**
     * 已取消数量
     */
    private String UUtnum_cancel;

    /**
     * 已验证数量
     */
    private String UUtnum_used;

    /**
     * 是否打印取票, 0-未打印，1-已打印
     */
    private String UUifprint;

    public String getUUmember() {
        return UUmember;
    }

    public void setUUmember(String UUmember) {
        this.UUmember = UUmember;
    }

    public String getUUordernum() {
        return UUordernum;
    }

    public void setUUordernum(String UUordernum) {
        this.UUordernum = UUordernum;
    }

    public String getUUremotenum() {
        return UUremotenum;
    }

    public void setUUremotenum(String UUremotenum) {
        this.UUremotenum = UUremotenum;
    }

    public String getUUlid() {
        return UUlid;
    }

    public void setUUlid(String UUlid) {
        this.UUlid = UUlid;
    }

    public String getUUtid() {
        return UUtid;
    }

    public void setUUtid(String UUtid) {
        this.UUtid = UUtid;
    }

    public String getUUpid() {
        return UUpid;
    }

    public void setUUpid(String UUpid) {
        this.UUpid = UUpid;
    }

    public String getUUbegintime() {
        return UUbegintime;
    }

    public void setUUbegintime(String UUbegintime) {
        this.UUbegintime = UUbegintime;
    }

    public String getUUordertime() {
        return UUordertime;
    }

    public void setUUordertime(String UUordertime) {
        this.UUordertime = UUordertime;
    }

    public String getUUendtime() {
        return UUendtime;
    }

    public void setUUendtime(String UUendtime) {
        this.UUendtime = UUendtime;
    }

    public String getUUtnum() {
        return UUtnum;
    }

    public void setUUtnum(String UUtnum) {
        this.UUtnum = UUtnum;
    }

    public String getUUtprice() {
        return UUtprice;
    }

    public void setUUtprice(String UUtprice) {
        this.UUtprice = UUtprice;
    }

    public String getUUordername() {
        return UUordername;
    }

    public void setUUordername(String UUordername) {
        this.UUordername = UUordername;
    }

    public String getUUorderte() {
        return UUorderte;
    }

    public void setUUorderte(String UUorderte) {
        this.UUorderte = UUorderte;
    }

    public String getUUstatus() {
        return UUstatus;
    }

    public void setUUstatus(String UUstatus) {
        this.UUstatus = UUstatus;
    }

    public String getUUsalerid() {
        return UUsalerid;
    }

    public void setUUsalerid(String UUsalerid) {
        this.UUsalerid = UUsalerid;
    }

    public String getUUdtime() {
        return UUdtime;
    }

    public void setUUdtime(String UUdtime) {
        this.UUdtime = UUdtime;
    }

    public String getUUtotalmoney() {
        return UUtotalmoney;
    }

    public void setUUtotalmoney(String UUtotalmoney) {
        this.UUtotalmoney = UUtotalmoney;
    }

    public String getUUpmode() {
        return UUpmode;
    }

    public void setUUpmode(String UUpmode) {
        this.UUpmode = UUpmode;
    }

    public String getUUordermode() {
        return UUordermode;
    }

    public void setUUordermode(String UUordermode) {
        this.UUordermode = UUordermode;
    }

    public String getUUctime() {
        return UUctime;
    }

    public void setUUctime(String UUctime) {
        this.UUctime = UUctime;
    }

    public String getUUcode() {
        return UUcode;
    }

    public void setUUcode(String UUcode) {
        this.UUcode = UUcode;
    }

    public String getUUcontacttel() {
        return UUcontacttel;
    }

    public void setUUcontacttel(String UUcontacttel) {
        this.UUcontacttel = UUcontacttel;
    }

    public String getUUaid() {
        return UUaid;
    }

    public void setUUaid(String UUaid) {
        this.UUaid = UUaid;
    }

    public String getUUifpack() {
        return UUifpack;
    }

    public void setUUifpack(String UUifpack) {
        this.UUifpack = UUifpack;
    }

    public String getUUpack_order() {
        return UUpack_order;
    }

    public void setUUpack_order(String UUpack_order) {
        this.UUpack_order = UUpack_order;
    }

    public String getUUsmserror() {
        return UUsmserror;
    }

    public void setUUsmserror(String UUsmserror) {
        this.UUsmserror = UUsmserror;
    }

    public String getUUorigin_num() {
        return UUorigin_num;
    }

    public void setUUorigin_num(String UUorigin_num) {
        this.UUorigin_num = UUorigin_num;
    }

    public String getUUlprice() {
        return UUlprice;
    }

    public void setUUlprice(String UUlprice) {
        this.UUlprice = UUlprice;
    }

    public String getUUplaytime() {
        return UUplaytime;
    }

    public void setUUplaytime(String UUplaytime) {
        this.UUplaytime = UUplaytime;
    }

    public String getUUpay_status() {
        return UUpay_status;
    }

    public void setUUpay_status(String UUpay_status) {
        this.UUpay_status = UUpay_status;
    }

    public String getUUconcat_id() {
        return UUconcat_id;
    }

    public void setUUconcat_id(String UUconcat_id) {
        this.UUconcat_id = UUconcat_id;
    }

    public String getUUseries() {
        return UUseries;
    }

    public void setUUseries(String UUseries) {
        this.UUseries = UUseries;
    }

    public String getUUmemo() {
        return UUmemo;
    }

    public void setUUmemo(String UUmemo) {
        this.UUmemo = UUmemo;
    }

    public String getUUltitle() {
        return UUltitle;
    }

    public void setUUltitle(String UUltitle) {
        this.UUltitle = UUltitle;
    }

    public String getUUp_type() {
        return UUp_type;
    }

    public void setUUp_type(String UUp_type) {
        this.UUp_type = UUp_type;
    }

    public String getUUttitle() {
        return UUttitle;
    }

    public void setUUttitle(String UUttitle) {
        this.UUttitle = UUttitle;
    }

    public String getUUMprice() {
        return UUMprice;
    }

    public void setUUMprice(String UUMprice) {
        this.UUMprice = UUMprice;
    }

    public String getUUdname() {
        return UUdname;
    }

    public void setUUdname(String UUdname) {
        this.UUdname = UUdname;
    }

    public String getUUtnum_cancel() {
        return UUtnum_cancel;
    }

    public void setUUtnum_cancel(String UUtnum_cancel) {
        this.UUtnum_cancel = UUtnum_cancel;
    }

    public String getUUtnum_used() {
        return UUtnum_used;
    }

    public void setUUtnum_used(String UUtnum_used) {
        this.UUtnum_used = UUtnum_used;
    }

    public String getUUifprint() {
        return UUifprint;
    }

    public void setUUifprint(String UUifprint) {
        this.UUifprint = UUifprint;
    }

    @Override
    public String toString() {
        return "{" +
                "UUmember='" + UUmember + '\'' +
                ", UUordernum='" + UUordernum + '\'' +
                ", UUremotenum='" + UUremotenum + '\'' +
                ", UUlid='" + UUlid + '\'' +
                ", UUtid='" + UUtid + '\'' +
                ", UUpid='" + UUpid + '\'' +
                ", UUbegintime='" + UUbegintime + '\'' +
                ", UUordertime='" + UUordertime + '\'' +
                ", UUendtime='" + UUendtime + '\'' +
                ", UUtnum='" + UUtnum + '\'' +
                ", UUtprice='" + UUtprice + '\'' +
                ", UUordername='" + UUordername + '\'' +
                ", UUorderte='" + UUorderte + '\'' +
                ", UUstatus='" + UUstatus + '\'' +
                ", UUsalerid='" + UUsalerid + '\'' +
                ", UUdtime='" + UUdtime + '\'' +
                ", UUtotalmoney='" + UUtotalmoney + '\'' +
                ", UUpmode='" + UUpmode + '\'' +
                ", UUordermode='" + UUordermode + '\'' +
                ", UUctime='" + UUctime + '\'' +
                ", UUcode='" + UUcode + '\'' +
                ", UUcontacttel='" + UUcontacttel + '\'' +
                ", UUaid='" + UUaid + '\'' +
                ", UUifpack='" + UUifpack + '\'' +
                ", UUpack_order='" + UUpack_order + '\'' +
                ", UUsmserror='" + UUsmserror + '\'' +
                ", UUorigin_num='" + UUorigin_num + '\'' +
                ", UUlprice='" + UUlprice + '\'' +
                ", UUplaytime='" + UUplaytime + '\'' +
                ", UUpay_status='" + UUpay_status + '\'' +
                ", UUconcat_id='" + UUconcat_id + '\'' +
                ", UUseries='" + UUseries + '\'' +
                ", UUmemo='" + UUmemo + '\'' +
                ", UUltitle='" + UUltitle + '\'' +
                ", UUp_type='" + UUp_type + '\'' +
                ", UUttitle='" + UUttitle + '\'' +
                ", UUMprice='" + UUMprice + '\'' +
                ", UUdname='" + UUdname + '\'' +
                ", UUtnum_cancel='" + UUtnum_cancel + '\'' +
                ", UUtnum_used='" + UUtnum_used + '\'' +
                ", UUifprint='" + UUifprint + '\'' +
                '}';
    }
}
