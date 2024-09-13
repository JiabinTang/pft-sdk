package cn.tangjiabin.pft.model.response.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderChangeByCodeResponse {

    /** 成功, 100-取消成功 ；1095-退票申请成功，待审核；1097-退票申请已受理，请勿重复提交 */
    private String UUdone;

    /** 退票成功扣除的手续费，若流水号重复提交，返回为 0, UUdone=100 有此参数 */
    private String UUrefund_fee;

    /** 退款购买的单价*退票数量，若流水号重复提交，返回为 0, UUdone=100 有此参数 */
    private String UUrefund_amount;

    /** 提交的退款流水号 */
    private String UUserial_number;

    public String getUUdone() {
        return UUdone;
    }

    public void setUUdone(String UUdone) {
        this.UUdone = UUdone;
    }

    public String getUUrefund_fee() {
        return UUrefund_fee;
    }

    public void setUUrefund_fee(String UUrefund_fee) {
        this.UUrefund_fee = UUrefund_fee;
    }

    public String getUUrefund_amount() {
        return UUrefund_amount;
    }

    public void setUUrefund_amount(String UUrefund_amount) {
        this.UUrefund_amount = UUrefund_amount;
    }

    public String getUUserial_number() {
        return UUserial_number;
    }

    public void setUUserial_number(String UUserial_number) {
        this.UUserial_number = UUserial_number;
    }

    @Override
    public String toString() {
        return "{" +
                "UUdone='" + UUdone + '\'' +
                ", UUrefund_fee='" + UUrefund_fee + '\'' +
                ", UUrefund_amount='" + UUrefund_amount + '\'' +
                ", UUserial_number='" + UUserial_number + '\'' +
                '}';
    }
}
