package cn.tangjiabin.pft.model.response.scenicspot;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class AreaCodeListResponse {
    /**
     * 区域编码
     */
    public String UUarea_code;

    /**
     * 区域名
     */
    public String UUarea_name;

    /**
     * 上级区域编码
     */
    public String UUparent_area_code;


    public String getUUarea_code() {
        return UUarea_code;
    }

    public void setUUarea_code(String UUarea_code) {
        this.UUarea_code = UUarea_code;
    }

    public String getUUarea_name() {
        return UUarea_name;
    }

    public void setUUarea_name(String UUarea_name) {
        this.UUarea_name = UUarea_name;
    }

    public String getUUparent_area_code() {
        return UUparent_area_code;
    }

    public void setUUparent_area_code(String UUparent_area_code) {
        this.UUparent_area_code = UUparent_area_code;
    }

    @Override
    public String toString() {
        return "{" +
                "\"UUarea_code\":\"" + UUarea_code + "\"," +
                "\"UUarea_name\":\"" + UUarea_name + "\"," +
                "\"UUparent_area_code\":\"" + UUparent_area_code + "\"" +
                "}";
    }
}
