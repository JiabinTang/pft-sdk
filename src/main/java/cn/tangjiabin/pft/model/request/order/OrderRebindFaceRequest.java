package cn.tangjiabin.pft.model.request.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderRebindFaceRequest {

    /** 票付通订单号 */
    private String pftOrder;

    /** 人脸图片链接, 可下载 */
    private String faceImgUrl;

    /** 图片序号, 从 1 开始到订单门票总张数 */
    private String idx;

    /** 姓名 */
    private String faceName;

    public String getPftOrder() {
        return pftOrder;
    }

    public void setPftOrder(String pftOrder) {
        this.pftOrder = pftOrder;
    }

    public String getFaceImgUrl() {
        return faceImgUrl;
    }

    public void setFaceImgUrl(String faceImgUrl) {
        this.faceImgUrl = faceImgUrl;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    @Override
    public String toString() {
        return "{" +
                "pftOrder='" + pftOrder + '\'' +
                ", faceImgUrl='" + faceImgUrl + '\'' +
                ", idx='" + idx + '\'' +
                ", faceName='" + faceName + '\'' +
                '}';
    }
}
