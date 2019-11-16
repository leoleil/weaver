package cn.edu.bupt.ipoc.onps.factory;

import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.model.entity.Weaver;

import java.util.List;

public class WeaverFactory {
    public Weaver make(){
        return new Weaver();
    }
    public Weaver make(List<CommonNode> commonNodes){
        return new Weaver(commonNodes);
    }
}
