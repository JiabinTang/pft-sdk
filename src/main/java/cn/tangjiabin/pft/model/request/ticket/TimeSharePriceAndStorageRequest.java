package cn.tangjiabin.pft.model.request.ticket;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class TimeSharePriceAndStorageRequest {

    /** 供应商 id, 对应 Get_Ticket_List.UUaid */
    private String aid;

    /** 门票 id, 对应 Get_Ticket_List.UUid */
    private String tid;

    /** 查询价格开始日期, 格式：Y-m-d, 结束日期不小于今日日期, 开始日期与结束日期的最大跨度为 31 天 */
    private String startDate;

    /** 查询价格结束日期, 格式：Y-m-d */
    private String endDate;

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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "TimeSharePriceAndStorageRequest{" +
                "aid='" + aid + '\'' +
                ", tid='" + tid + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
