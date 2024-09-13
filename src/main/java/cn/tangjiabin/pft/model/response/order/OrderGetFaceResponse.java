package cn.tangjiabin.pft.model.response.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderGetFaceResponse {

    /** 手机号 */
    private String UUmobile;

    /** 姓名 */
    private String UUnickname;

    /** 证件号 */
    private String UUidcard;

    /** 图片序号 */
    private String UUidx;

    /** 人脸图片链接 */
    private String UUface_url;

    public String getUUmobile() {
        return UUmobile;
    }

    public void setUUmobile(String UUmobile) {
        this.UUmobile = UUmobile;
    }

    public String getUUnickname() {
        return UUnickname;
    }

    public void setUUnickname(String UUnickname) {
        this.UUnickname = UUnickname;
    }

    public String getUUidcard() {
        return UUidcard;
    }

    public void setUUidcard(String UUidcard) {
        this.UUidcard = UUidcard;
    }

    public String getUUidx() {
        return UUidx;
    }

    public void setUUidx(String UUidx) {
        this.UUidx = UUidx;
    }

    public String getUUface_url() {
        return UUface_url;
    }

    public void setUUface_url(String UUface_url) {
        this.UUface_url = UUface_url;
    }

    @Override
    public String toString() {
        return "{" +
                "UUmobile='" + UUmobile + '\'' +
                ", UUnickname='" + UUnickname + '\'' +
                ", UUidcard='" + UUidcard + '\'' +
                ", UUidx='" + UUidx + '\'' +
                ", UUface_url='" + UUface_url + '\'' +
                '}';
    }
}
