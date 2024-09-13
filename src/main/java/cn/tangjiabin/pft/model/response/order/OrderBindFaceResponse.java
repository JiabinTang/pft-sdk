package cn.tangjiabin.pft.model.response.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderBindFaceResponse {

    /** 成功, 100 为绑定成功 */
    private String UUdone;

    public String getUUdone() {
        return UUdone;
    }

    public void setUUdone(String UUdone) {
        this.UUdone = UUdone;
    }

    @Override
    public String toString() {
        return "{" +
                "UUdone='" + UUdone + '\'' +
                '}';
    }
}
