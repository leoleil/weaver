package cn.edu.bupt.ipoc.onps.utils.resultUtils;

import cn.edu.bupt.ipoc.onps.utils.ConstantString;

import java.util.List;

/**
 * 向前端返回数据的工具类
 *
 * @param <T> 需要返回的实体对象的类型
 */
public class BaseResult<T> {
    private String status;       //处理结果状态
    private String message;      //返回信息
    private T entity;            //返回实体对象
    private List<T> list;        //返回结果集

    public BaseResult(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResult(String status, String message, T entity, List<T> list) {
        this.status = status;
        this.message = message;
        this.entity = entity;
        this.list = list;
    }

    public BaseResult(String status, T entity, List<T> list) {
        this.list = list;
        this.status = status;
        this.entity = entity;
    }

    public BaseResult(String status, List<T> list) {
        this.list = list;
        this.status = status;
    }

    public BaseResult(String status, T entity) {
        this.status = status;
        this.entity = entity;
    }

    private BaseResult(String status, String message, T entity) {
        this.status = status;
        this.message = message;
        this.entity = entity;
    }

    public BaseResult() {
    }


    /**
     * 创建成功的返回结果
     *
     * @return
     */
    public static <T> BaseResult createSuccessResult(T data) {
        return new BaseResult(ConstantString.STATUS_SUCCESS, "操作成功", data);
    }

    /**
     * 创建失败的返回结果
     *
     * @return
     */
    public static <T> BaseResult createFailResult(T data) {
        return new BaseResult(ConstantString.STATUS_FAIL, "操作失败", data);
    }

    public BaseResult(String status) {
        this.status = status;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
