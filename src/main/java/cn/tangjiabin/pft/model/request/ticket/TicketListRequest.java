package cn.tangjiabin.pft.model.request.ticket;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class TicketListRequest {

    /**
     * 景区 id
     * n 和 m 不可同时为空,只传 n 时返回多个门票二维数组，该景区下只有一个门票时回传一维数组
     */
    private String n;

    /**
     * 门票 id
     * 传 m 为精确查找，只返回该门票的一维数组,特殊情况下，一个门票有多个供应商供应也会返回二维数组
     */
    private String m;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "TicketListRequest{" +
                "n='" + n + '\'' +
                ", m='" + m + '\'' +
                '}';
    }
}
