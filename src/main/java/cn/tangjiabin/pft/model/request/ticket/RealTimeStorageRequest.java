package cn.tangjiabin.pft.model.request.ticket;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class RealTimeStorageRequest {

    /** 供应商 id, 对应 Get_Ticket_List.UUaid */
    private String aid;

    /** 价格 id, 对应 Get_Ticket_List.UUpid */
    private String pid;

    /** 查询价格开始日期, 格式：Y-m-d, 结束日期不小于今日日期, 开始日期与结束日期的最大跨度为 31 天 */
    private String start_date;

    /** 查询价格结束日期, 格式：Y-m-d */
    private String end_date;


    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "RealTimeStorageRequest{" +
                "aid='" + aid + '\'' +
                ", pid='" + pid + '\'' +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                '}';
    }
}
