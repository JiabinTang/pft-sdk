package cn.tangjiabin.pft.model.request.scenicspot;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class ScenicSpotListRequest {

    /**
     * 获取数据起始位
     * <p>n 跟 m 参数需要求余等于 0，即 n % m = 0</p>
     */
    public String n;

    /**
     * 获取数据条数
     * <p>取第 0-100 条。输入 n=0,m=100
     * 取第 100-200 条，输入 n=100，m=100
     * 取第 200-300 条，输入 n=200, m=100</p>
     */
    public String m;

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
        return "ScenicSpotListRequest{" +
                "n='" + n + '\'' +
                ", m='" + m + '\'' +
                '}';
    }
}
