package cn.tangjiabin.pft.config;

/**
 * 票付通配置类
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-11
 */

public class PFTConfig {

    /**
     * 票付通接口地址
     * <p>测试接口请求地址：</p>
     * <ul>
     *   <li>PHP http://open.12301dev.com/openService/MXSE_beta.wsdl </li>
     *   <li>非PHP语言 http://open.12301dev.com/openService/pftMX.php </li>
     * </ul>
     * <p>正式接口请求地址：</p>
     * <ul>
     *   <li>PHP http://open.12301.cc/openService/MXSE.wsdl </li>
     *   <li>非PHP语言 http://open.12301.cc/openService/pftMX.php </li>
     * </ul>
     */
    private String url;

    /**
     * 票付通分配的账号
     */
    private String ac;

    /**
     * 票付通分配的密码
     */
    private String pw;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "{" +
                "\"url\":\"" + url + "\"" +
                ", \"ac\":\"" + ac + "\"" +
                ", \"pw\":\"" + pw + "\"" +
                "}";
    }
}
