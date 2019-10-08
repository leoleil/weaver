package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.LinkOfFiberPO;

import java.util.List;

public interface FiberLinkDAO {
    List<LinkOfFiberPO> selectFiberLinkByProjectId(String id);
}
