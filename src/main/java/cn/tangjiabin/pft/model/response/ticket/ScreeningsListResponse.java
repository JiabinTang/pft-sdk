package cn.tangjiabin.pft.model.response.ticket;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class ScreeningsListResponse {

    /**
     * 场馆 id
     */
    private String UUvenus_id;

    /**
     * 场次 id
     */
    private String UUround_id;

    /**
     * 分区 id
     */
    private String UUzone_id;

    /**
     * 场次名称
     */
    private String UUround_name;

    /**
     * 分区名称
     */
    private String UUzone_name;

    /**
     * 演出日期
     */
    private String UUuse_date;

    /**
     * 开始时间
     */
    private String UUbt;

    /**
     * 结束时间
     */
    private String UUet;

    /**
     * 剩余库存
     */
    private String UUstorage;

    /**
     * 演出场次排序id
     */
    private String UUround_sort_id;

    public String getUUvenus_id() {
        return UUvenus_id;
    }

    public void setUUvenus_id(String UUvenus_id) {
        this.UUvenus_id = UUvenus_id;
    }

    public String getUUround_id() {
        return UUround_id;
    }

    public void setUUround_id(String UUround_id) {
        this.UUround_id = UUround_id;
    }

    public String getUUzone_id() {
        return UUzone_id;
    }

    public void setUUzone_id(String UUzone_id) {
        this.UUzone_id = UUzone_id;
    }

    public String getUUround_name() {
        return UUround_name;
    }

    public void setUUround_name(String UUround_name) {
        this.UUround_name = UUround_name;
    }

    public String getUUzone_name() {
        return UUzone_name;
    }

    public void setUUzone_name(String UUzone_name) {
        this.UUzone_name = UUzone_name;
    }

    public String getUUuse_date() {
        return UUuse_date;
    }

    public void setUUuse_date(String UUuse_date) {
        this.UUuse_date = UUuse_date;
    }

    public String getUUbt() {
        return UUbt;
    }

    public void setUUbt(String UUbt) {
        this.UUbt = UUbt;
    }

    public String getUUet() {
        return UUet;
    }

    public void setUUet(String UUet) {
        this.UUet = UUet;
    }

    public String getUUstorage() {
        return UUstorage;
    }

    public void setUUstorage(String UUstorage) {
        this.UUstorage = UUstorage;
    }

    public String getUUround_sort_id() {
        return UUround_sort_id;
    }

    public void setUUround_sort_id(String UUround_sort_id) {
        this.UUround_sort_id = UUround_sort_id;
    }

    @Override
    public String toString() {
        return "{\"UUvenus_id\":\"" + UUvenus_id + "\",\"UUround_id\":\"" + UUround_id + "\",\"UUzone_id\":\"" + UUzone_id + "\",\"UUround_name\":\"" + UUround_name + "\",\"UUzone_name\":\"" + UUzone_name + "\",\"UUuse_date\":\"" + UUuse_date + "\",\"UUbt\":\"" + UUbt + "\",\"UUet\":\"" + UUet + "\",\"UUstorage\":\"" + UUstorage + "\",\"UUround_sort_id\":\"" + UUround_sort_id + "\"}";
    }
}
