package cn.edu.bupt.ipoc.onps.factory;

import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.model.entity.Weaver;

import java.util.List;

public class WeaverFactory {
    private static final WeaverFactory INSTANCE = new WeaverFactory();
    private WeaverFactory(){}
    public static WeaverFactory getInstace(){
        return INSTANCE;
    }
    public Weaver make(){
        return new Weaver();
    }
    public Weaver make(List<CommonNode> commonNodes){
        return new Weaver(commonNodes);
    }
}
