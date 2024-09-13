package cn.tangjiabin.pft.model.request.member;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class PFTMemberRelationshipRequest {

    /**
     * 查询类型, 1-查看我的分销商 2-查看我的供应商 3-查看我的员工
     */
    private String n;

    /**
     * 页码, 默认为 1，条数默认 100 条
     */
    private String m;


    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "{" +
                "\"n\":\"" + n + "\"" +
                ", \"m\":\"" + m + "\"" +
                "}";
    }
}
