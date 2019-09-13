package cn.edu.bupt.ipoc.onps.base;

public class PageInfo<T> {
    /**
     * 封装的状态
     */
    public static final int SUCCESS_STATUS=0;
    public static final int FAIL_STATUS=1;

    /**
     * 上一页 页码
     */
    private int prePage;
    /**
     * 当前页的页码
     */
    private int currentPage;
    /**
     * 下一页
     */
    private int nextPage;

    /**
     * 页面的大小
     */
    private int pageSize;

    /**
     * 总页数
     */
    private int pageTotal;

    /**
     * 总数据量
     */
    private int dataTotal;

    /**
     * 状态   0  是正常的请求  1不是正常的请求
     */
    private int status;
    /**
     * 状态的基本信息
     */
    private String statusMessage;

    /**
     * 返回的数据
     */
    private T data;


    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public int getDataTotal() {
        return dataTotal;
    }

    public void setDataTotal(int dataTotal) {
        this.dataTotal = dataTotal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
