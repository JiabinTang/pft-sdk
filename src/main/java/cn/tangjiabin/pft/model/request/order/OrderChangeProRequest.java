package cn.tangjiabin.pft.model.request.order;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderChangeProRequest {

    /**
     * 票付通订单号
     */
    private String ordern;

    /**
     * 剩余数量, 修改/取消方法的 num 为剩余数量，要加上已核销的数量；例子：如果购买 5 张，要退 2 张，num 值传输 3；5 张都要取消，num 传输 0；如果购买 5 张，已消费 2 张，想要退 2 张，num 传输 3
     */
    private String num;

    /**
     * 游客手机号
     */
    private String ordertel;

    /**
     * 退款流水号, 长度最多 32 位，每次提交的流水号需要唯一
     */
    private String m;

    public String getOrdern() {
        return ordern;
    }

    public void setOrdern(String ordern) {
        this.ordern = ordern;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getOrdertel() {
        return ordertel;
    }

    public void setOrdertel(String ordertel) {
        this.ordertel = ordertel;
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
                ", num='" + num + '\'' +
                ", ordertel='" + ordertel + '\'' +
                ", m='" + m + '\'' +
                '}';
    }

}
