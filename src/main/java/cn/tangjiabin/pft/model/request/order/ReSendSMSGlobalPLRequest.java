package cn.tangjiabin.pft.model.request.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class ReSendSMSGlobalPLRequest {

    /** 票付通订单号 */
    private String ordern;

    /** 预留参数 */
    private String m;

    public String getOrdern() {
        return ordern;
    }

    public void setOrdern(String ordern) {
        this.ordern = ordern;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "{" +
                "ordern='" + ordern + '\'' +
                ", m='" + m + '\'' +
                '}';
    }
}
