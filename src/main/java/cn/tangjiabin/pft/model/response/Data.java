package cn.tangjiabin.pft.model.response;

import java.util.ArrayList;
import java.util.List;

/**
 * 通用返回体
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class Data<T> {

    // 请求状态 成功 失败
    private Boolean success;

    private List<T> Rec;

    private String UUerrorcode;

    private String UUerrorinfo;

    public Data() {
    }

    public Data(List<T> rec) {
        this.success = Boolean.TRUE;
        Rec = rec;
    }

    public Data(String UUerrorcode, String UUerrorinfo) {
        this.success = Boolean.FALSE;
        Rec = new ArrayList<>();
        this.UUerrorcode = UUerrorcode;
        this.UUerrorinfo = UUerrorinfo;
    }


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<T> getRec() {
        return Rec;
    }

    public void setRec(List<T> rec) {
        Rec = rec;
    }

    public String getUUerrorcode() {
        return UUerrorcode;
    }

    public void setUUerrorcode(String UUerrorcode) {
        this.UUerrorcode = UUerrorcode;
    }

    public String getUUerrorinfo() {
        return UUerrorinfo;
    }

    public void setUUerrorinfo(String UUerrorinfo) {
        this.UUerrorinfo = UUerrorinfo;
    }

    @Override
    public String toString() {
        StringBuilder recListJson = new StringBuilder("[");
        if (Rec != null) {
            for (int i = 0; i < Rec.size(); i++) {
                recListJson.append(Rec.get(i).toString());
                if (i < Rec.size() - 1) {
                    recListJson.append(",");
                }
            }
        }
        recListJson.append("]");

        return "{" +
                "\"success\":" + success + "," +
                "\"Rec\":" + recListJson.toString() + "," +
                "\"UUerrorcode\":\"" + UUerrorcode + "\"," +
                "\"UUerrorinfo\":\"" + UUerrorinfo + "\"" +
                "}";
    }
}
