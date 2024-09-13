package cn.tangjiabin.pft.model.request.scenicspot;

/**
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-12
 */


public class AreaCodeListRequest {

    /**
     * 页码
     */
    private String page;

    /**
     * 每页显示数量
     */
    private String pageNum;


    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }
}
