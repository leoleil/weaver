package cn.edu.bupt.ipoc.onps.utils;

/**
 * 状态标识
 * 不可实例化
 * @author chenleiyu
 * @since 20193/12
 */
public class ConstantString {
    public final static String    STATUS_SUCCESS     = "S00001";  //成功状态
    public final static String    STATUS_FAIL        = "S00002";  //失败状态
    public final static String    STATUS_OTHER       = "S00003";  //其他状态
    private ConstantString(){}
}
