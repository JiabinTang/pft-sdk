package cn.tangjiabin.pft.model.response.scenicspot;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */

public class ScenicSpotInfoResponse {

    /**
     * 详细地址
     */
    private String UUaddress;

    /**
     * 所在地区，区号
     */
    private String UUarea;

    /**
     * 景区介绍
     */
    private String UUbhjq;

    /**
     * 景区 id 对应下单 lid
     */
    private String UUid;

    /**
     * 缩略图 仅首图
     */
    private String UUimgpath;

    /**
     * 景区级别
     * AAAAA,AAAA,AAA,AA,A,非A级
     * 0 的时候为未设置级别
     */
    private String UUjtype;

    /**
     * 景区名称
     */
    private String UUtitle;

    /**
     * 相关提示
     */
    private String UUjqts;

    /*
     * 营业时间
     */
    private String UUruntime;

    /**
     * 资源 id
     */
    private String UUsalerid;

    /**
     * 联系传真
     */
    private String UUfax;

    /**
     * 景区在售状态
     * 都是可售的，不可售的查询不到
     */
    private String UUstatus;

    /**
     * 联系电话
     */
    private String UUtel;

    /**
     * 旅游主题
     */
    private String UUtopics;

    /**
     * 经纬度
     * eg: 119.30347,26.080429 百度地图
     */
    private String UUlng_lat_pos;

    /**
     * 省级编码
     */
    private String UUprovince_code;

    /**
     * 城市编码
     */
    private String UUcity_code;

    /**
     * 交通指南
     */
    private String UUjtzn;

    /**
     * 产品类型
     * A 景点 B 线路 C 酒店 F 套票 H 演出
     * 分销对接支持类型:景点，套票，演出
     */
    private String UUp_type;

    /**
     * 开放时间 废弃值
     */
    @Deprecated
    private String UUopentime;

    /**
     * 是否开启分时库存 0-否，1-是, -- 不作为判断依据，以门票详情的该字段为主
     */
    private String UUopen_section;


    public String getUUaddress() {
        return UUaddress;
    }

    public void setUUaddress(String UUaddress) {
        this.UUaddress = UUaddress;
    }

    public String getUUarea() {
        return UUarea;
    }

    public void setUUarea(String UUarea) {
        this.UUarea = UUarea;
    }

    public String getUUbhjq() {
        return UUbhjq;
    }

    public void setUUbhjq(String UUbhjq) {
        this.UUbhjq = UUbhjq;
    }

    public String getUUid() {
        return UUid;
    }

    public void setUUid(String UUid) {
        this.UUid = UUid;
    }

    public String getUUimgpath() {
        return UUimgpath;
    }

    public void setUUimgpath(String UUimgpath) {
        this.UUimgpath = UUimgpath;
    }

    public String getUUjtype() {
        return UUjtype;
    }

    public void setUUjtype(String UUjtype) {
        this.UUjtype = UUjtype;
    }

    public String getUUtitle() {
        return UUtitle;
    }

    public void setUUtitle(String UUtitle) {
        this.UUtitle = UUtitle;
    }

    public String getUUjqts() {
        return UUjqts;
    }

    public void setUUjqts(String UUjqts) {
        this.UUjqts = UUjqts;
    }

    public String getUUruntime() {
        return UUruntime;
    }

    public void setUUruntime(String UUruntime) {
        this.UUruntime = UUruntime;
    }

    public String getUUsalerid() {
        return UUsalerid;
    }

    public void setUUsalerid(String UUsalerid) {
        this.UUsalerid = UUsalerid;
    }

    public String getUUfax() {
        return UUfax;
    }

    public void setUUfax(String UUfax) {
        this.UUfax = UUfax;
    }

    public String getUUstatus() {
        return UUstatus;
    }

    public void setUUstatus(String UUstatus) {
        this.UUstatus = UUstatus;
    }

    public String getUUtel() {
        return UUtel;
    }

    public void setUUtel(String UUtel) {
        this.UUtel = UUtel;
    }

    public String getUUtopics() {
        return UUtopics;
    }

    public void setUUtopics(String UUtopics) {
        this.UUtopics = UUtopics;
    }

    public String getUUlng_lat_pos() {
        return UUlng_lat_pos;
    }

    public void setUUlng_lat_pos(String UUlng_lat_pos) {
        this.UUlng_lat_pos = UUlng_lat_pos;
    }

    public String getUUprovince_code() {
        return UUprovince_code;
    }

    public void setUUprovince_code(String UUprovince_code) {
        this.UUprovince_code = UUprovince_code;
    }

    public String getUUcity_code() {
        return UUcity_code;
    }

    public void setUUcity_code(String UUcity_code) {
        this.UUcity_code = UUcity_code;
    }

    public String getUUjtzn() {
        return UUjtzn;
    }

    public void setUUjtzn(String UUjtzn) {
        this.UUjtzn = UUjtzn;
    }

    public String getUUp_type() {
        return UUp_type;
    }

    public void setUUp_type(String UUp_type) {
        this.UUp_type = UUp_type;
    }

    public String getUUopentime() {
        return UUopentime;
    }

    public void setUUopentime(String UUopentime) {
        this.UUopentime = UUopentime;
    }

    public String getUUopen_section() {
        return UUopen_section;
    }

    public void setUUopen_section(String UUopen_section) {
        this.UUopen_section = UUopen_section;
    }

    @Override
    public String toString() {
        return "{" +
                "\"UUaddress\":\"" + UUaddress + "\"," +
                "\"UUarea\":\"" + UUarea + "\"," +
                "\"UUbhjq\":\"" + UUbhjq + "\"," +
                "\"UUid\":\"" + UUid + "\"," +
                "\"UUimgpath\":\"" + UUimgpath + "\"," +
                "\"UUjtype\":\"" + UUjtype + "\"," +
                "\"UUtitle\":\"" + UUtitle + "\"," +
                "\"UUjqts\":\"" + UUjqts + "\"," +
                "\"UUruntime\":\"" + UUruntime + "\"," +
                "\"UUsalerid\":\"" + UUsalerid + "\"," +
                "\"UUfax\":\"" + UUfax + "\"," +
                "\"UUstatus\":\"" + UUstatus + "\"," +
                "\"UUtel\":\"" + UUtel + "\"," +
                "\"UUtopics\":\"" + UUtopics + "\"," +
                "\"UUlng_lat_pos\":\"" + UUlng_lat_pos + "\"," +
                "\"UUprovince_code\":\"" + UUprovince_code + "\"," +
                "\"UUcity_code\":\"" + UUcity_code + "\"," +
                "\"UUjtzn\":\"" + UUjtzn + "\"," +
                "\"UUp_type\":\"" + UUp_type + "\"," +
                "\"UUopentime\":\"" + UUopentime + "\"," +
                "\"UUopen_section\":" + UUopen_section + "\"" +
                "}";
    }
}
