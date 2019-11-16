package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.factory.WeaverFactory;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;
import cn.edu.bupt.ipoc.onps.utils.TypeString;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeaverTest {
    //创建拓扑实例
    @Test
    public void createTopo(){
        WeaverFactory weaverFactory = new WeaverFactory();
        Weaver weaver = weaverFactory.make();
        //先创建节点
        CommonNode node01 = new CommonNode.Builder("北京",116.3,39.9)
                .level(0)
                .status(LinkStatusString.FREE)
                .type(TypeString.OLD)
                .year(2019)
                .build();
        CommonNode node02 = new CommonNode.Builder("成都",103.7,36.1)
                .level(0)
                .status(LinkStatusString.FREE)
                .type(TypeString.OLD)
                .year(2019)
                .build();
        CommonNode node03 = new CommonNode.Builder("南京",118.7,32.1)
                .level(0)
                .status(LinkStatusString.FREE)
                .type(TypeString.OLD)
                .year(2019)
                .build();
        weaver.addNode(node01);
        weaver.addNode(node02);
        weaver.addNode(node03);
        //创建链路
        BasicLink fiberLink01 =  new FiberLink.Builder("北京-成都",node01,node02,10)
                .length(1000)
                .status(LinkStatusString.FREE)
                .type(TypeString.OLD)
                .year(2019)
                .build();
        BasicLink fiberLink02 = (FiberLink) new FiberLink.Builder("成都-南京",node01,node02,10)
                .length(1000)
                .status(LinkStatusString.FREE)
                .type(TypeString.OLD)
                .year(2019)
                .build();
        BasicLink fiberLink03 = (FiberLink) new FiberLink.Builder("南京-北京",node01,node02,10)
                .length(1000)
                .status(LinkStatusString.FREE)
                .type(TypeString.OLD)
                .year(2019)
                .build();
        weaver.addLink(fiberLink01);
        weaver.addLink(fiberLink02);
        weaver.addLink(fiberLink03);

    }
}