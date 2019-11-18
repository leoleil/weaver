package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.factory.WeaverFactory;
import cn.edu.bupt.ipoc.onps.utils.LayerString;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;
import cn.edu.bupt.ipoc.onps.utils.TypeString;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WeaverTest {
    //创建拓扑实例
    @Test
    public void createTopo(){
        Weaver weaver = WeaverFactory.getInstace().make();
        //先创建节点
        CommonNode node01 = new CommonNode.Builder("北京",116.3,39.9)
                .level(0)
                .status(LinkStatusString.FREE)//设置节点状态
                .type(TypeString.OLD)//设置节点类型
                .year(2019)//设置节点的年份
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
                .length(1000)//设链路长度
                .status(LinkStatusString.FREE)//链路状态
                .type(TypeString.OLD)//链路创建类型 表示链路是原有的
                .year(2019)//链路年份
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
        List<BasicLink> fiberLink = new ArrayList<>();
        fiberLink.add(fiberLink03);
        BasicLink wdmLink01 = (WDMLink) new WDMLink.Builder("北京-南京 wdm",node01,node02)
                .size(10)
                .layerRoute(fiberLink)
                .length(1000)
                .year(2019)
                .type(TypeString.NEW)//表示链路是新建的
                .build();
        weaver.addLink(wdmLink01);
        weaver.deleteLink(wdmLink01.getId());
        BasicLink otnLink01 = new OTNLink.Builder("北京-南京 otn",node01,node02)
                .size(10)
                .layerRoute(fiberLink)
                .year(2019)
                .type(TypeString.NEW)
                .length(100)
                .carriedType(LayerString.FIBER)
                .build();
        weaver.addLink(otnLink01);
        BasicLink sdhLink01 = new SDHLink.Builder("北京-南京",node01,node02)
                .size(10)
                .layerRoute(fiberLink)
                .year(2019)
                .type(TypeString.NEW)
                .length(100)
                .carriedType(LayerString.FIBER)
                .build();
        weaver.addLink(sdhLink01);
        weaver.deleteLink(otnLink01.getId());
        weaver.deleteLink(sdhLink01.getId());

    }
}