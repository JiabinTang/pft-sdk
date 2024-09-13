package cn.tangjiabin.pft.model.response.ticket;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class RealTimeStorageResponse {

    /**
     * 价格日期
     */
    private String date;

    /**
     * 总库存, 0：表示日库存为空 -1：表示日库存不限 -2：表示停止售卖
     */
    private String storage;

    /**
     * 实时剩余库存, -1 表示不限，99999999 表示不限
     */
    private String remain;

    /**
     * 结算价, 单位：分，预下单接口校验
     */
    private String buy_price;

    /**
     * 零售价, 单位：分
     */
    private String retail_price;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getRemain() {
        return remain;
    }

    public void setRemain(String remain) {
        this.remain = remain;
    }

    public String getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(String buy_price) {
        this.buy_price = buy_price;
    }

    public String getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(String retail_price) {
        this.retail_price = retail_price;
    }

    @Override
    public String toString() {
        return "{\"date\":\"" + date + "\",\"storage\":\"" + storage + "\",\"remain\":\"" + remain + "\",\"buy_price\":\"" + buy_price + "\",\"retail_price\":\"" + retail_price + "\"}";
    }
}
