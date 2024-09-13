package cn.tangjiabin.pft.model.response.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderSubmitResponse {

    /** 票付通订单号 */
    private String UUordernum;

    /** 远端订单号, 贵方订单号 */
    private String UUremotenum;

    /** 凭证码/消费码, 凭证码，注：若凭证码是空的，需对接 2.3 三方消费码异步回调来获取码。多个值使用英文逗号分割 eg：123,456 */
    private String UUcode;

    /** 订单详情链接 */
    private String UUqrcodeURL;

    /** 二维码图片 */
    private String UUqrcodeIMG;

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

    public String getUUcode() {
        return UUcode;
    }

    public void setUUcode(String UUcode) {
        this.UUcode = UUcode;
    }

    public String getUUqrcodeURL() {
        return UUqrcodeURL;
    }

    public void setUUqrcodeURL(String UUqrcodeURL) {
        this.UUqrcodeURL = UUqrcodeURL;
    }

    public String getUUqrcodeIMG() {
        return UUqrcodeIMG;
    }

    public void setUUqrcodeIMG(String UUqrcodeIMG) {
        this.UUqrcodeIMG = UUqrcodeIMG;
    }

    @Override
    public String toString() {
        return "{" +
                "UUordernum='" + UUordernum + '\'' +
                ", UUremotenum='" + UUremotenum + '\'' +
                ", UUcode='" + UUcode + '\'' +
                ", UUqrcodeURL='" + UUqrcodeURL + '\'' +
                ", UUqrcodeIMG='" + UUqrcodeIMG + '\'' +
                '}';
    }
}
