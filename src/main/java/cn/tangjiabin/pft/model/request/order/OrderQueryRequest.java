package cn.tangjiabin.pft.model.request.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderQueryRequest {

    /** 票付通订单号, 可为空，为空时 remoteOrdernum 不能为空 */
    private String pftOrdernum;

    /** 远端订单号, 为空时 pftOrdernum 不能为空 */
    private String remoteOrdernum;

    public String getPftOrdernum() {
        return pftOrdernum;
    }

    public void setPftOrdernum(String pftOrdernum) {
        this.pftOrdernum = pftOrdernum;
    }

    public String getRemoteOrdernum() {
        return remoteOrdernum;
    }

    public void setRemoteOrdernum(String remoteOrdernum) {
        this.remoteOrdernum = remoteOrdernum;
    }

    @Override
    public String toString() {
        return "{" +
                "pftOrdernum='" + pftOrdernum + '\'' +
                ", remoteOrdernum='" + remoteOrdernum + '\'' +
                '}';
    }
}
