package cn.tangjiabin.pft.model.request.order;

/**
 * 供应商强制退票请求
 *
 * <p>供应商强制退功能，默认不对外开放；</p>
 * <p>需要商家向票付通提交申请，票付审核通过后，给商家开通，方可使用；</p>
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderChangeForceRequest {

    /** 取消流水号, 同一次请求的流水号，如果重试这个流水号需要一致 */
    private String reqSerialNumber;

    /** 票付通订单号, 一次传一个 */
    private String ordern;

    public String getReqSerialNumber() {
        return reqSerialNumber;
    }

    public void setReqSerialNumber(String reqSerialNumber) {
        this.reqSerialNumber = reqSerialNumber;
    }

    public String getOrdern() {
        return ordern;
    }

    public void setOrdern(String ordern) {
        this.ordern = ordern;
    }

    @Override
    public String toString() {
        return "{" +
                "reqSerialNumber='" + reqSerialNumber + '\'' +
                ", ordern='" + ordern + '\'' +
                '}';
    }
}
