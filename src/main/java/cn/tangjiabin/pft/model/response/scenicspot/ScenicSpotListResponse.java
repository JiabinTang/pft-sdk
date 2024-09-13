package cn.tangjiabin.pft.model.response.scenicspot;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class ScenicSpotListResponse {

    /**
     * 景区 id
     */
    private String UUid;

    /**
     * 产品名称
     */
    private String UUtitle;

    /**
     * 添加时间
     * <p>格式：0000-00-00 00:00:00</p>
     */
    private String UUaddtime;

    /**
     * 缩略图
     */
    private String UUimgpath;

    /**
     * 所在地区
     * <p>福建省|福州市</p>
     */
    private String UUarea;

    /**
     * 产品类型
     * <p>A 景点 B 线路 C 酒店 F 套票 H 演出 分销对接支持类型:景点，套票，演出</p>
     */
    private String UUp_type;


    public String getUUid() {
        return UUid;
    }

    public void setUUid(String UUid) {
        this.UUid = UUid;
    }

    public String getUUtitle() {
        return UUtitle;
    }

    public void setUUtitle(String UUtitle) {
        this.UUtitle = UUtitle;
    }

    public String getUUaddtime() {
        return UUaddtime;
    }

    public void setUUaddtime(String UUaddtime) {
        this.UUaddtime = UUaddtime;
    }

    public String getUUimgpath() {
        return UUimgpath;
    }

    public void setUUimgpath(String UUimgpath) {
        this.UUimgpath = UUimgpath;
    }

    public String getUUarea() {
        return UUarea;
    }

    public void setUUarea(String UUarea) {
        this.UUarea = UUarea;
    }

    public String getUUp_type() {
        return UUp_type;
    }

    public void setUUp_type(String UUp_type) {
        this.UUp_type = UUp_type;
    }

    @Override
    public String toString() {
        return "{" +
                "\"UUid\":\"" + UUid + "\"," +
                "\"UUtitle\":\"" + UUtitle + "\"," +
                "\"UUaddtime\":\"" + UUaddtime + "\"," +
                "\"UUimgpath\":\"" + UUimgpath + "\"," +
                "\"UUarea\":\"" + UUarea + "\"," +
                "\"UUp_type\":\"" + UUp_type + "\"" +
                "}";
    }
}
