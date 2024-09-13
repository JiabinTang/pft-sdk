package cn.tangjiabin.pft.model.response.ticket;

import java.util.List;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class TimeSharePriceAndStorageResponse {

    /**
     * 价格日期
     */
    private String date;

    /**
     * 结算价, 单位：分，预下单接口校验
     */
    private String buy_price;

    /**
     * 零售价, 单位：分
     */
    private String retail_price;

    /**
     * 分时库存数组，包含以下信息
     */
    private List<Period> periodList;




    public static class Period {
        /**
         * 开始时间
         */
        private String start_time;

        /**
         * 结束时间
         */
        private String end_time;

        /**
         * 总库存, -1 表示不限，99999999 表示不限
         */
        private String storage;

        /**
         * 实时剩余库存
         */
        private String remain;

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
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

        @Override
        public String toString() {
            return "{" +
                    "\"start_time\":\"" + start_time + "\"," +
                    "\"end_time\":\"" + end_time + "\"," +
                    "\"storage\":\"" + storage + "\"," +
                    "\"remain\":\"" + remain + "\"" +
                    "}";
        }
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public List<Period> getPeriodList() {
        return periodList;
    }

    public void setPeriodList(List<Period> periodList) {
        this.periodList = periodList;
    }

    @Override
    public String toString() {
        StringBuilder periodListJson = new StringBuilder("[");
        if (periodList != null) {
            for (int i = 0; i < periodList.size(); i++) {
                periodListJson.append(periodList.get(i).toString());
                if (i < periodList.size() - 1) {
                    periodListJson.append(",");
                }
            }
        }
        periodListJson.append("]");

        return "{" +
                "\"date\":\"" + date + "\"," +
                "\"buy_price\":\"" + buy_price + "\"," +
                "\"retail_price\":\"" + retail_price + "\"," +
                "\"periodList\":" + periodListJson.toString() +
                "}";
    }
}
