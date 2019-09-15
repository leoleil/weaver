package cn.edu.bupt.ipoc.onps.service;

import cn.edu.bupt.ipoc.onps.model.entity.FiberLink;
import cn.edu.bupt.ipoc.onps.model.entity.OTNLink;
import cn.edu.bupt.ipoc.onps.model.entity.SDHLink;
import cn.edu.bupt.ipoc.onps.model.entity.WDMLink;

public interface LinkManageService {
    /**
     * 新建链路
     * @param name 链路名字
     * @param fromNodeId 起点ID
     * @param toNodeId 终点ID
     * @param length 链路长度
     * @param size 链路资源数
     * @param year 链路年份
     * @return 返回创建的链路
     * @throws Exception 如果节点不存在抛出空指针异常
     */
    public FiberLink addFiberLink(String name, String fromNodeId, String toNodeId, double length, int size, int year)throws Exception;

    /**
     * 更新链路
     * @param id 用于定位的ID
     * @param name 更改的名字
     * @param length 更改的长度
     * @param addSize 扩容大小，一定要正值，不然不起作用
     * @param year 更改的年份
     * @return 返回创建的链路
     */
    public FiberLink updateFiberLink(String id, String name, double length, int addSize, int year)throws Exception;

    /**
     * 删除链路
     * @param id 用于定位的ID
     * @return 成功返回true,如果此链路本来就不存在则返回false
     */
    public boolean deleteFiberLink(String id)throws Exception;

    public WDMLink addWDMLink(String name, String fromNodeId, String toNodeId, double length, double rate, int size, int year) throws Exception;
    public WDMLink updateWDMLink(String id, String name, double length, int addSize, int year)throws Exception;
    public boolean deleteWDMLink(String id)throws Exception;

    public OTNLink addOTNLink(String name, String fromNodeId, String toNodeId, double length, double rate, int size, int year, String layer) throws Exception;
    public OTNLink updateOTNLink(String id, String name, double length, int addSize, int year) throws Exception;
    public boolean deleteOTNLink(String id)throws Exception;

    public SDHLink addSDHLink(String name, String fromNodeId, String toNodeId, double length, double rate, int size, int year, String layer) throws Exception;
    public SDHLink updateSDHLink(String id, String name, double length, int addSize, int year) throws Exception;
    public boolean deleteSDHLink(String id)throws Exception;
}
