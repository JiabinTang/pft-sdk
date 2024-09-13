package cn.tangjiabin.pft.model.request.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderGetFaceRequest {

    /** 票付通订单号 */
    private String pftOrder;

    public String getPftOrder() {
        return pftOrder;
    }

    public void setPftOrder(String pftOrder) {
        this.pftOrder = pftOrder;
    }

    @Override
    public String toString() {
        return "{" +
                "pftOrder='" + pftOrder + '\'' +
                '}';
    }
}
