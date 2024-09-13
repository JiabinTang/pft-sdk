package cn.tangjiabin.pft.model.request.scenicspot;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class ScenicSpotInfoRequest {

    /**
     * 景区 id
     */
    private String n;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "ScenicSpotInfoRequest{" +
                "n='" + n + '\'' +
                '}';
    }
}
