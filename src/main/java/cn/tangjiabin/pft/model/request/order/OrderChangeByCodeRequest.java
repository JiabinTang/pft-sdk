package cn.tangjiabin.pft.model.request.order;

/**
 * 指定门票退票
 *
 * <p>无身份证/身份证错误/身份证未查询到，退票失败</p>
 * <p>同一笔订单多次退（同一笔订单中，同一个信息或同一条流水多次退）：通过流水号做区分；</p>
 * <p>使用“指定门票退票”接口进行退票时，暂不支持票属性配置“一票种一张票”的订单；对接时请仔细确认商家配置；若如此操作，将会出现异常退票情况；</p>
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class OrderChangeByCodeRequest {

    /** 取消流水号, 同一次请求的流水号，如果重试这个流水号需要一致 */
    private String reqSerialNumber;

    /** 票付通订单号, 一次传一个 */
    private String ordern;

    /** 取消介质, 取消介质：certificate=证件，code=消费码；备注：按消费码取消后续版本支持 */
    private String changeByType;

    /** 证件号, 当 changeByType="certificate" 的时候，这个证件号需要传；如果多个用“,”隔开；最多支持100个证件 */
    private String certificateNumbers;

    /** 证件类型, 当 changeByType="certificate" 的时候，这个证件类型需要传；如果多个用“,”隔开，数量需要和 certificateNumbers 对齐 1=身份证, 2=护照, 3=军官证, 4=回乡证, 5=台胞证, 7=港澳通行证,8=台湾通行证, 9=港澳居民居住证, 10=台湾居民居住证, 99=其他 备注：暂时只支持身份证证件取消 */
    private String certificateTypes;

    /** 消费码, 当 changeByType="code" 的时候，这个消费码需要传，如果多个用“,”隔开 备注：按消费码取消后续版本支持 */
    private String checkCodes;

    public String getReqSerialNumber() {
        return reqSerialNumber;
    }

    public void setReqSerialNumber(String reqSerialNumber) {
        this.reqSerialNumber = reqSerialNumber;
    }

    public String getOrdern() {
        return ordern;
    }

    public void setOrdern(String ordern) {
        this.ordern = ordern;
    }

    public String getChangeByType() {
        return changeByType;
    }

    public void setChangeByType(String changeByType) {
        this.changeByType = changeByType;
    }

    public String getCertificateNumbers() {
        return certificateNumbers;
    }

    public void setCertificateNumbers(String certificateNumbers) {
        this.certificateNumbers = certificateNumbers;
    }

    public String getCertificateTypes() {
        return certificateTypes;
    }

    public void setCertificateTypes(String certificateTypes) {
        this.certificateTypes = certificateTypes;
    }

    public String getCheckCodes() {
        return checkCodes;
    }

    public void setCheckCodes(String checkCodes) {
        this.checkCodes = checkCodes;
    }

    @Override
    public String toString() {
        return "{" +
                "reqSerialNumber='" + reqSerialNumber + '\'' +
                ", ordern='" + ordern + '\'' +
                ", changeByType='" + changeByType + '\'' +
                ", certificateNumbers='" + certificateNumbers + '\'' +
                ", certificateTypes='" + certificateTypes + '\'' +
                ", checkCodes='" + checkCodes + '\'' +
                '}';
    }
}
