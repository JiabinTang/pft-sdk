package cn.tangjiabin.pft.model.response.ticket;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class TicketListResponse {

    /** 供应商 id, 对应下单 m 字段 */
    private String UUaid;

    /** 集合地点, 线路 */
    private String UUass_station;

    /** 最大年龄限制 */
    private String UUage_limit_max;

    /** 最小年龄限制 */
    private String UUage_limit_min;

    /** 限购票数 (废弃), 与 buy_limit_date 合用 */
    private String UUbuy_limit_num;

    /** 购买限制时间 (废弃), 手机号或者身份证在限制时间内只能购买限购的票数 */
    private String UUbuy_limit_date;

    /** 购买限制 (废弃), 针对手机号以及证件的限制，0-不限，1-手机号-张票，2-身份证-张票，3-手机号-笔订单，4-身份证-笔订单，5-同时-张票，6-同时-笔订单 */
    private String UUbuy_limit;

    /** 购买上限, 本次订单购买上限，0 表示不限 */
    private String UUbuy_limit_up;

    /** 购买下限, 本次订单购买下限 */
    private String UUbuy_limit_low;

    /** 目的地, 线路 */
    private String UUendplace;

    /** 订单过期后处理方式, 1-不做处理，2-自动完结，3-自动验证，4-自动取消 */
    private String UUexpire_action;

    /** 多少天后自动处理 - 结合 expire_action 使用 */
    private String UUexpire_action_days;

    /** 自动取消的手续费- 结合 expire_action 使用 */
    private String UUexpire_cancel_fee;

    /** 取票信息 */
    private String UUgetaddr;

    /** 门票 id */
    private String UUid;

    /** 身份证信息, 0-不需要填写，1-需要填写，2-需要填写所有游客身份证，3-随子票规则，4-取票人与所有游客填写身份信息 */
    private String UUtourist_info;

    /** 购票须知 */
    private String UUnotes;

    /** 景区 id */
    private String UUlid;

    /** 门票名称 */
    private String UUtitle;

    /** 未支付多少分钟内自动取消 */
    private String UUcancel_auto_onMin;

    /** 更改数量, 0-只可减少，大于 0 为增减或减少的上限比例 */
    private String UUnum_modify;

    /** 支付方式, 0-现场支付，1-在线支付 */
    private String UUpay;

    /** 一次游玩天数, 线路 */
    private String UUrdays;

    /** 提前下单时间间隔, 此参数与 UUdhour 结合使用，例：UUddays 为 1，UUdhour 为 12:00:00，购票需提前一天，并在 12 点之前购买 */
    private String UUddays;

    /** 提前下单截止具体时间, 此参数与 UUddays 结合使用 */
    private String UUdhour;

    /** 提前下单最多 间隔天数, 废弃 */
    private String UUmax_order_days;

    /** 是否当日可取票, 0-不限，1-单日可取，2-有效期可取，3-预约当日可取 */
    private String UUprint_ticket_limit;

    /** 价格 id */
    private String UUpid;

    /** 退票审核, 0-不需要审核，1-需要审核 */
    private String UUrefund_audit;

    /** 退票规则, 0-有效期前 X 天内可退：过期订单供应商可退, 1-有效期后 X 天内可退，过期订单供应商可退, 2-不可退：分销商供应商都不可退, 3-随时退：未使用订单末级分销商可退；过期订单分销商可退，供应商可退, -1=不可退且是可提现 */
    private String UUrefund_rule;

    /** 取消费用 （阶梯扣费）, 二维数组： c_cost：扣费金额，单位分； c_type：扣费类型 0-固定金额，单位分，1-百分比； c_days：游玩前多少分钟可退； 例子： [{"c_cost":"100","c_type":"0","c_days":"1440"},{"c_cost":"200","c_type":"0","c_days":"2880"}] 游玩日期前 1 天扣费固定金额 1 元钱；游玩日期前 2 天扣费固定金额 2 元钱。仅演出时使用 */
    private String UUcancel_cost;

    /** 有效期前 X 天内可退的时间, 有效期前 X 天内可退的时间设置 存分钟数，UUrefund_rule = 0 */
    private String UUrefund_before_early_time;

    /** 退票提前多少分钟, 仅演出时使用 */
    private String UUrefund_early_time;

    /** 有效期后 X 天内可退的时间, 有效期后 X 天内可退的时间设置 存分钟数，UUrefund_rule = 1 */
    private String UUrefund_after_early_time;

    /** 取消费用类型, 0-百分比；1-扣费金额，单位分。 */
    private String UUreb_type;

    /** 退款数值, UUreb_type=0,值在[0，100]间，reb_type=1 时，单位为“分” 。备注（1）：UUreb 为空 并且 UUrefund_cost_step_rule 为空，则无需手续费, 备注（2）：UUreb 不为空，则是固定金额手续费, 备注（3）：UUrefund_cost_step_rule 不为空，则是阶梯手续费 */
    private String UUreb;

    /** 固定金额订单收费类型, 0=每张票 1=每笔订单。举例（1）：UUreb_type =1，UUreb = 100，UUrefund_cost_fixed_type = 0。取消订单，每张票收取 1 元手续费。举例（2）：UUreb_type =0，UUreb = 10，UUrefund_cost_fixed_type = 1。取消订单，一笔收取订单金额 10%手续费 */
    private String UUrefund_cost_fixed_type;

    /** 阶梯手续费, step_rule_common：全局配置规则，step_rule_common_rule1 确定退票方式每笔或每张, step_rule_list:购票后至检票截止日期之前规则配置，该规则可配置多个, step_rule_end:最晚时间之后的规则配置，该规则只有一个。举例：{ "step_rule_common":{ "step_rule_common_rule1":0, //0=每张票 1=每笔订单 }, "step_rule_list":[ { "step_rule_list_minu":-11111,//存分钟数 前为负数 后为正数 "step_rule_list_value": 10, //费用值 具体金额的时候存分 "step_rule_list_type": 0 //0=百分比 1=具体金额 }, { "step_rule_list_minu":2222,//存分钟数 前为负数 后为正数 "step_rule_list_value": 10, //费用值 具体金额的时候存分 "step_rule_list_type": 1 //0=百分比 1=具体金额 } ], "step_rule_end": { "step_rule_end_value": 0, // 之后的费用值 0=未设置 "step_rule_list_type": 1 //0=百分比 1=具体金额 } }购票后至检票截止日期前 120 分钟每张票扣 10%，购票后至检票截止日期后 120 分钟每张票扣 10%。购票后至检票截止日期后 120 分钟之后未配置 */
    private String UUrefund_cost_step_rule;

    /** 销售渠道 */
    private String UUshop;

    /** 出发城市或地区, 线路 */
    private String UUstartplace;

    /** 门票状态, 1-上架，2-下架，6-删除 */
    private String UUstatus;

    /** 市场价, 单位：元 */
    private String UUtprice;

    /** 团号模型, 线路 */
    private String UUseries_model;

    /** 游玩后 X 天 */
    private String UUdelaydays;

    /** 游玩前 X 天 */
    private String UUuse_early_days;

    /** 期票结束日期 */
    private String UUorder_end;

    /** 期票起始日期 */
    private String UUorder_start;

    /** 游玩日期前不可验证, 0-不限，1-游玩日期前不可验证 */
    private String UUif_verify;

    /** 使用有效期类型, 0-游玩日期起有效（UUdelaydays 为设置的天数）, 1-下单日期起有效, 2-期票模式（UUorder_start 为期票开始时间，UUorder_end 为期票结束日期）, 3-下单第二天至指定日期（UUorder_end 为指定结束日期）, 4-游玩日期至指定时间 （UUorder_end 为指定结束日期） */
    private String UUdelaytype;

    /** 验证排除星期，默认全部, 1=周日，2=周一，3=周二，以此类推 */
    private String UUorder_limit;

    /** 验证时间 */
    private String UUv_time_limit;

    /** 分批验证, 0-不支持，1-支持，2-一票一码，3-一票一证 */
    private String UUbatch_check;

    /** 延迟验证时间 */
    private String UUdelaytime;

    /** 是否开启分时库存, 0-否，1-是 */
    private String UUopen_section;

    /** 是否需要选择游玩日期, 1-无需选择游玩日期, 0-需要选择游玩日期 */
    private String UUpre_sale;

    /** 取票人限制类型, 0-无 ，1-手机号，2-身份证，3-手机号+身份证 */
    private String UUbuyer_limit_type;

    /** 取票人限制内容, json 数组： buyer_order_days:取票人订单限制间隔天数，单位 ：天，0 和-1 为不限。 buyer_order_total:取票人订单限制数量。单位：笔，0 和-1 为不限。 例 ：buyer_limit_type =1， buyer_order_days=1，buyer_order_total=2。则取票人同一个手机号一天内可购买两笔订单。 buyer_ticket_days:取票人门票限制间隔天数，单位：天，0 和-1 为不限。 buyer_ticket_total:取票人门票限制数量 ，单位：张，0 和-1 为不限。例 ： buyer_limit_type =2， buyer_ticket_days=1，buyer_ticket_total=2。则取票人同一个身份证一天内可购买两张门票 buyer_order_interval:取票人每笔购买间隔，单位：分钟，0 和-1 为不限。例：buyer_limit_type =3 buyer_order_interval= 30，则取票人同一个身份证加手机号，下单 30 分钟后才可下第二笔订单 */
    private String UUbuyer_limit_content;

    /** 游客限制类型, 0-无， 2-身份证 */
    private String UUtourist_limit_type;

    /** 游客限制内容, json 数组： tourist_order_days:游客订单限制间隔天数，单位 ：天，0 和-1 为不限。 tourist_order_total:游客订单限制数量。单位：笔，0 和-1 为不限。 例 ：tourist_limit_type=2， tourist_order_days=1，tourist_order_total=2。则游客同一个身份证一天内可购买两笔订单 tourist_ticket_days:游客门票限制间隔天数，单位：天，0 和-1 为不限。 tourist_ticket_total:游客门票限制数量 ，单位：张，0 和-1 为不限。例 ： tourist_limit_type=2， tourist_ticket_days=1，tourist_ticket_total=2。则游客同一个身份证一天内可购买两张门票 tourist_order_interval:游客每笔购买间隔，单位：分钟，0 和-1 为不限。例：tourist_limit_type=2 tourist_order_interval= 30，则游客同一个身份证，下单 30 分钟后才可下第二笔订单。 */
    private String UUtourist_limit_content;

    public String getUUaid() {
        return UUaid;
    }

    public void setUUaid(String UUaid) {
        this.UUaid = UUaid;
    }

    public String getUUass_station() {
        return UUass_station;
    }

    public void setUUass_station(String UUass_station) {
        this.UUass_station = UUass_station;
    }

    public String getUUage_limit_max() {
        return UUage_limit_max;
    }

    public void setUUage_limit_max(String UUage_limit_max) {
        this.UUage_limit_max = UUage_limit_max;
    }

    public String getUUage_limit_min() {
        return UUage_limit_min;
    }

    public void setUUage_limit_min(String UUage_limit_min) {
        this.UUage_limit_min = UUage_limit_min;
    }

    public String getUUbuy_limit_num() {
        return UUbuy_limit_num;
    }

    public void setUUbuy_limit_num(String UUbuy_limit_num) {
        this.UUbuy_limit_num = UUbuy_limit_num;
    }

    public String getUUbuy_limit_date() {
        return UUbuy_limit_date;
    }

    public void setUUbuy_limit_date(String UUbuy_limit_date) {
        this.UUbuy_limit_date = UUbuy_limit_date;
    }

    public String getUUbuy_limit() {
        return UUbuy_limit;
    }

    public void setUUbuy_limit(String UUbuy_limit) {
        this.UUbuy_limit = UUbuy_limit;
    }

    public String getUUbuy_limit_up() {
        return UUbuy_limit_up;
    }

    public void setUUbuy_limit_up(String UUbuy_limit_up) {
        this.UUbuy_limit_up = UUbuy_limit_up;
    }

    public String getUUbuy_limit_low() {
        return UUbuy_limit_low;
    }

    public void setUUbuy_limit_low(String UUbuy_limit_low) {
        this.UUbuy_limit_low = UUbuy_limit_low;
    }

    public String getUUendplace() {
        return UUendplace;
    }

    public void setUUendplace(String UUendplace) {
        this.UUendplace = UUendplace;
    }

    public String getUUexpire_action() {
        return UUexpire_action;
    }

    public void setUUexpire_action(String UUexpire_action) {
        this.UUexpire_action = UUexpire_action;
    }

    public String getUUexpire_action_days() {
        return UUexpire_action_days;
    }

    public void setUUexpire_action_days(String UUexpire_action_days) {
        this.UUexpire_action_days = UUexpire_action_days;
    }

    public String getUUexpire_cancel_fee() {
        return UUexpire_cancel_fee;
    }

    public void setUUexpire_cancel_fee(String UUexpire_cancel_fee) {
        this.UUexpire_cancel_fee = UUexpire_cancel_fee;
    }

    public String getUUgetaddr() {
        return UUgetaddr;
    }

    public void setUUgetaddr(String UUgetaddr) {
        this.UUgetaddr = UUgetaddr;
    }

    public String getUUid() {
        return UUid;
    }

    public void setUUid(String UUid) {
        this.UUid = UUid;
    }

    public String getUUtourist_info() {
        return UUtourist_info;
    }

    public void setUUtourist_info(String UUtourist_info) {
        this.UUtourist_info = UUtourist_info;
    }

    public String getUUnotes() {
        return UUnotes;
    }

    public void setUUnotes(String UUnotes) {
        this.UUnotes = UUnotes;
    }

    public String getUUlid() {
        return UUlid;
    }

    public void setUUlid(String UUlid) {
        this.UUlid = UUlid;
    }

    public String getUUtitle() {
        return UUtitle;
    }

    public void setUUtitle(String UUtitle) {
        this.UUtitle = UUtitle;
    }

    public String getUUcancel_auto_onMin() {
        return UUcancel_auto_onMin;
    }

    public void setUUcancel_auto_onMin(String UUcancel_auto_onMin) {
        this.UUcancel_auto_onMin = UUcancel_auto_onMin;
    }

    public String getUUnum_modify() {
        return UUnum_modify;
    }

    public void setUUnum_modify(String UUnum_modify) {
        this.UUnum_modify = UUnum_modify;
    }

    public String getUUpay() {
        return UUpay;
    }

    public void setUUpay(String UUpay) {
        this.UUpay = UUpay;
    }

    public String getUUrdays() {
        return UUrdays;
    }

    public void setUUrdays(String UUrdays) {
        this.UUrdays = UUrdays;
    }

    public String getUUddays() {
        return UUddays;
    }

    public void setUUddays(String UUddays) {
        this.UUddays = UUddays;
    }

    public String getUUdhour() {
        return UUdhour;
    }

    public void setUUdhour(String UUdhour) {
        this.UUdhour = UUdhour;
    }

    public String getUUmax_order_days() {
        return UUmax_order_days;
    }

    public void setUUmax_order_days(String UUmax_order_days) {
        this.UUmax_order_days = UUmax_order_days;
    }

    public String getUUprint_ticket_limit() {
        return UUprint_ticket_limit;
    }

    public void setUUprint_ticket_limit(String UUprint_ticket_limit) {
        this.UUprint_ticket_limit = UUprint_ticket_limit;
    }

    public String getUUpid() {
        return UUpid;
    }

    public void setUUpid(String UUpid) {
        this.UUpid = UUpid;
    }

    public String getUUrefund_audit() {
        return UUrefund_audit;
    }

    public void setUUrefund_audit(String UUrefund_audit) {
        this.UUrefund_audit = UUrefund_audit;
    }

    public String getUUrefund_rule() {
        return UUrefund_rule;
    }

    public void setUUrefund_rule(String UUrefund_rule) {
        this.UUrefund_rule = UUrefund_rule;
    }

    public String getUUcancel_cost() {
        return UUcancel_cost;
    }

    public void setUUcancel_cost(String UUcancel_cost) {
        this.UUcancel_cost = UUcancel_cost;
    }

    public String getUUrefund_before_early_time() {
        return UUrefund_before_early_time;
    }

    public void setUUrefund_before_early_time(String UUrefund_before_early_time) {
        this.UUrefund_before_early_time = UUrefund_before_early_time;
    }

    public String getUUrefund_early_time() {
        return UUrefund_early_time;
    }

    public void setUUrefund_early_time(String UUrefund_early_time) {
        this.UUrefund_early_time = UUrefund_early_time;
    }

    public String getUUrefund_after_early_time() {
        return UUrefund_after_early_time;
    }

    public void setUUrefund_after_early_time(String UUrefund_after_early_time) {
        this.UUrefund_after_early_time = UUrefund_after_early_time;
    }

    public String getUUreb_type() {
        return UUreb_type;
    }

    public void setUUreb_type(String UUreb_type) {
        this.UUreb_type = UUreb_type;
    }

    public String getUUreb() {
        return UUreb;
    }

    public void setUUreb(String UUreb) {
        this.UUreb = UUreb;
    }

    public String getUUrefund_cost_fixed_type() {
        return UUrefund_cost_fixed_type;
    }

    public void setUUrefund_cost_fixed_type(String UUrefund_cost_fixed_type) {
        this.UUrefund_cost_fixed_type = UUrefund_cost_fixed_type;
    }

    public String getUUrefund_cost_step_rule() {
        return UUrefund_cost_step_rule;
    }

    public void setUUrefund_cost_step_rule(String UUrefund_cost_step_rule) {
        this.UUrefund_cost_step_rule = UUrefund_cost_step_rule;
    }

    public String getUUshop() {
        return UUshop;
    }

    public void setUUshop(String UUshop) {
        this.UUshop = UUshop;
    }

    public String getUUstartplace() {
        return UUstartplace;
    }

    public void setUUstartplace(String UUstartplace) {
        this.UUstartplace = UUstartplace;
    }

    public String getUUstatus() {
        return UUstatus;
    }

    public void setUUstatus(String UUstatus) {
        this.UUstatus = UUstatus;
    }

    public String getUUtprice() {
        return UUtprice;
    }

    public void setUUtprice(String UUtprice) {
        this.UUtprice = UUtprice;
    }

    public String getUUseries_model() {
        return UUseries_model;
    }

    public void setUUseries_model(String UUseries_model) {
        this.UUseries_model = UUseries_model;
    }

    public String getUUdelaydays() {
        return UUdelaydays;
    }

    public void setUUdelaydays(String UUdelaydays) {
        this.UUdelaydays = UUdelaydays;
    }

    public String getUUuse_early_days() {
        return UUuse_early_days;
    }

    public void setUUuse_early_days(String UUuse_early_days) {
        this.UUuse_early_days = UUuse_early_days;
    }

    public String getUUorder_end() {
        return UUorder_end;
    }

    public void setUUorder_end(String UUorder_end) {
        this.UUorder_end = UUorder_end;
    }

    public String getUUorder_start() {
        return UUorder_start;
    }

    public void setUUorder_start(String UUorder_start) {
        this.UUorder_start = UUorder_start;
    }

    public String getUUif_verify() {
        return UUif_verify;
    }

    public void setUUif_verify(String UUif_verify) {
        this.UUif_verify = UUif_verify;
    }

    public String getUUdelaytype() {
        return UUdelaytype;
    }

    public void setUUdelaytype(String UUdelaytype) {
        this.UUdelaytype = UUdelaytype;
    }

    public String getUUorder_limit() {
        return UUorder_limit;
    }

    public void setUUorder_limit(String UUorder_limit) {
        this.UUorder_limit = UUorder_limit;
    }

    public String getUUv_time_limit() {
        return UUv_time_limit;
    }

    public void setUUv_time_limit(String UUv_time_limit) {
        this.UUv_time_limit = UUv_time_limit;
    }

    public String getUUbatch_check() {
        return UUbatch_check;
    }

    public void setUUbatch_check(String UUbatch_check) {
        this.UUbatch_check = UUbatch_check;
    }

    public String getUUdelaytime() {
        return UUdelaytime;
    }

    public void setUUdelaytime(String UUdelaytime) {
        this.UUdelaytime = UUdelaytime;
    }

    public String getUUopen_section() {
        return UUopen_section;
    }

    public void setUUopen_section(String UUopen_section) {
        this.UUopen_section = UUopen_section;
    }

    public String getUUpre_sale() {
        return UUpre_sale;
    }

    public void setUUpre_sale(String UUpre_sale) {
        this.UUpre_sale = UUpre_sale;
    }

    public String getUUbuyer_limit_type() {
        return UUbuyer_limit_type;
    }

    public void setUUbuyer_limit_type(String UUbuyer_limit_type) {
        this.UUbuyer_limit_type = UUbuyer_limit_type;
    }

    public String getUUbuyer_limit_content() {
        return UUbuyer_limit_content;
    }

    public void setUUbuyer_limit_content(String UUbuyer_limit_content) {
        this.UUbuyer_limit_content = UUbuyer_limit_content;
    }

    public String getUUtourist_limit_type() {
        return UUtourist_limit_type;
    }

    public void setUUtourist_limit_type(String UUtourist_limit_type) {
        this.UUtourist_limit_type = UUtourist_limit_type;
    }

    public String getUUtourist_limit_content() {
        return UUtourist_limit_content;
    }

    public void setUUtourist_limit_content(String UUtourist_limit_content) {
        this.UUtourist_limit_content = UUtourist_limit_content;
    }

    @Override
    public String toString() {
        return "{" +
                "\"UUaid\":\"" + UUaid + "\"," +
                "\"UUass_station\":\"" + UUass_station + "\"," +
                "\"UUage_limit_max\":\"" + UUage_limit_max + "\"," +
                "\"UUage_limit_min\":\"" + UUage_limit_min + "\"," +
                "\"UUbuy_limit_num\":\"" + UUbuy_limit_num + "\"," +
                "\"UUbuy_limit_date\":\"" + UUbuy_limit_date + "\"," +
                "\"UUbuy_limit\":\"" + UUbuy_limit + "\"," +
                "\"UUbuy_limit_up\":\"" + UUbuy_limit_up + "\"," +
                "\"UUbuy_limit_low\":\"" + UUbuy_limit_low + "\"," +
                "\"UUendplace\":\"" + UUendplace + "\"," +
                "\"UUexpire_action\":\"" + UUexpire_action + "\"," +
                "\"UUexpire_action_days\":\"" + UUexpire_action_days + "\"," +
                "\"UUexpire_cancel_fee\":\"" + UUexpire_cancel_fee + "\"," +
                "\"UUgetaddr\":\"" + UUgetaddr + "\"," +
                "\"UUid\":\"" + UUid + "\"," +
                "\"UUtourist_info\":\"" + UUtourist_info + "\"," +
                "\"UUnotes\":\"" + UUnotes + "\"," +
                "\"UUlid\":\"" + UUlid + "\"," +
                "\"UUtitle\":\"" + UUtitle + "\"," +
                "\"UUcancel_auto_onMin\":\"" + UUcancel_auto_onMin + "\"," +
                "\"UUnum_modify\":\"" + UUnum_modify + "\"," +
                "\"UUpay\":\"" + UUpay + "\"," +
                "\"UUrdays\":\"" + UUrdays + "\"," +
                "\"UUddays\":\"" + UUddays + "\"," +
                "\"UUdhour\":\"" + UUdhour + "\"," +
                "\"UUmax_order_days\":\"" + UUmax_order_days + "\"," +
                "\"UUprint_ticket_limit\":\"" + UUprint_ticket_limit + "\"," +
                "\"UUpid\":\"" + UUpid + "\"," +
                "\"UUrefund_audit\":\"" + UUrefund_audit + "\"," +
                "\"UUrefund_rule\":\"" + UUrefund_rule + "\"," +
                "\"UUcancel_cost\":\"" + UUcancel_cost + "\"," +
                "\"UUrefund_before_early_time\":\"" + UUrefund_before_early_time + "\"," +
                "\"UUrefund_early_time\":\"" + UUrefund_early_time + "\"," +
                "\"UUrefund_after_early_time\":\"" + UUrefund_after_early_time + "\"," +
                "\"UUreb_type\":\"" + UUreb_type + "\"," +
                "\"UUreb\":\"" + UUreb + "\"," +
                "\"UUrefund_cost_fixed_type\":\"" + UUrefund_cost_fixed_type + "\"," +
                "\"UUrefund_cost_step_rule\":\"" + UUrefund_cost_step_rule + "\"," +
                "\"UUshop\":\"" + UUshop + "\"," +
                "\"UUstartplace\":\"" + UUstartplace + "\"," +
                "\"UUstatus\":\"" + UUstatus + "\"," +
                "\"UUtprice\":\"" + UUtprice + "\"," +
                "\"UUseries_model\":\"" + UUseries_model + "\"," +
                "\"UUdelaydays\":\"" + UUdelaydays + "\"," +
                "\"UUuse_early_days\":\"" + UUuse_early_days + "\"," +
                "\"UUorder_end\":\"" + UUorder_end + "\"," +
                "\"UUorder_start\":\"" + UUorder_start + "\"," +
                "\"UUif_verify\":\"" + UUif_verify + "\"," +
                "\"UUdelaytype\":\"" + UUdelaytype + "\"," +
                "\"UUorder_limit\":\"" + UUorder_limit + "\"," +
                "\"UUv_time_limit\":\"" + UUv_time_limit + "\"," +
                "\"UUbatch_check\":\"" + UUbatch_check + "\"," +
                "\"UUdelaytime\":\"" + UUdelaytime + "\"," +
                "\"UUopen_section\":\"" + UUopen_section + "\"," +
                "\"UUpre_sale\":\"" + UUpre_sale + "\"," +
                "\"UUbuyer_limit_type\":\"" + UUbuyer_limit_type + "\"," +
                "\"UUbuyer_limit_content\":\"" + UUbuyer_limit_content + "\"," +
                "\"UUtourist_limit_type\":\"" + UUtourist_limit_type + "\"," +
                "\"UUtourist_limit_content\":\"" + UUtourist_limit_content + "\"" +
                "}";
    }
}
