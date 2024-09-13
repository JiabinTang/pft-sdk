package cn.tangjiabin.pft.model.request.ticket;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class ScreeningsListRequest {

    /** 供应商 id, 对应 Get_Ticket_List.UUaid */
    private String aid;

    /** 门票 id, 对应 Get_Ticket_List.UUid */
    private String tid;

    /** 演出日期, 格式：Y-m-d */
    private String date;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ScreeningsListRequest{" +
                "aid='" + aid + '\'' +
                ", tid='" + tid + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
