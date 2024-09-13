package cn.tangjiabin.pft.config;

/**
 * 请求方法
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */

public class PFTMethods {

    /**
     * 产品服务
     */
    public static class ScenicSpot {
        /**
         * 产品列表（可选）
         */
        public static final String GET_SCENIC_SPOT_LIST = "Get_ScenicSpot_List";
        /**
         * 产品详情（可选）
         */
        public static final String GET_SCENIC_SPOT_INFO = "Get_ScenicSpot_Info";
        /**
         * 获取城市编码（可选）
         */
        public static final String GET_AREA_CODE_LIST = "Get_Area_Code_List";
    }

    /**
     * 门票服务
     */
    public static class Ticket {
        /**
         * 门票列表详情（可选）
         */
        public static final String GET_TICKET_LIST = "Get_Ticket_List";
        /**
         * 日历价格库存（可选）
         */
        public static final String GET_REAL_TIME_STORAGE = "GetRealTimeStorage";
        /**
         * 分时价格库存（可选）
         */
        public static final String TIME_SHARE_PRICE_AND_STORAGE = "Time_Share_Price_And_Storage";
        /**
         * 场次信息（演出产品类型；可选）
         */
        public static final String GET_SCREENINGS_LIST = "Get_Screenings_List";
    }

    /**
     * 会员服务
     */
    public static class Member {
        /**
         * 会员关系查看 （可选）
         */
        public static final String PFT_MEMBER_RELATIONSHIP = "PFT_Member_Relationship";
        /**
         * 资金余额查看（可选）
         */
        public static final String PFT_MEMBER_FUND = "PFT_Member_Fund";
        /**
         * 结算方式查看 （可选）
         */
        public static final String MEMBER_SETTLEMENT = "Member_Settlement";
    }

    /**
     * 订单服务
     */
    public static class Order {
        /**
         * 预判下单 （判断提交的参数是否满足下单条件，没有生成订单；可选）
         */
        public static final String ORDER_PRE_CHECK = "OrderPreCheck";
        /**
         * 提交订单 （已支付订单提交，必接）
         */
        public static final String PFT_ORDER_SUBMIT = "PFT_Order_Submit";
        /**
         * 查询订单（可选）
         */
        public static final String ORDER_QUERY = "OrderQuery";
        /**
         * 取消订单（必接）
         */
        public static final String ORDER_CHANGE_PRO = "Order_Change_Pro";
        /**
         * 重发短信 （可选）
         */
        public static final String RESEND_SMS_GLOBAL_PL = "reSend_SMS_Global_PL";
        /**
         * 人脸绑定订单 （可选）
         */
        public static final String ORDER_BIND_FACE = "Order_Bind_Face";
        /**
         * 人脸订单更新绑定 （可选）
         */
        public static final String ORDER_REBIND_FACE = "Order_Rebind_Face";
        /**
         * 订单查询人脸绑定信息 （可选）
         */
        public static final String ORDER_GET_FACE = "Order_Get_Face";
        /**
         * 指定门票退票 （可选）
         */
        public static final String ORDER_CHANGE_BY_CODE = "Order_Change_By_Code";
        /**
         * 供应商强制退（可选）
         */
        public static final String ORDER_CHANGE_FORCE = "Order_Change_Force";
    }

}
