import cn.edu.bupt.ipoc.onps.base.algrithm.route.LayerRouteFinder;
import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.model.entity.FiberLink;
import cn.edu.bupt.ipoc.onps.model.entity.WDMLink;
import cn.edu.bupt.ipoc.onps.utils.LayerString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TopoTest {
    @Test
    public void createTopo(){
        List<CommonNode> commonNodeList = new ArrayList<>();
        List<BasicLink> fiberList = new ArrayList<>();


        CommonNode node1 = new CommonNode.Builder("北京",39.909736,116.367188).build();
        CommonNode node2 = new CommonNode.Builder("兰州",36.102376,103.798828).build();
        CommonNode node3 = new CommonNode.Builder("成都",30.751278,104.0625).build();
        CommonNode node4 = new CommonNode.Builder("成都1",30.751278,104.0625).build();
        CommonNode node5 = new CommonNode.Builder("成都2",30.751278,104.0625).build();
        commonNodeList.add(node1);
        commonNodeList.add(node2);
        commonNodeList.add(node3);
        commonNodeList.add(node4);
        commonNodeList.add(node5);


        BasicLink fiberLink1 = new FiberLink.Builder("1",node1,node2,10)
                .length(1000)
                .build();
        BasicLink fiberLink2 = new FiberLink.Builder("2",node2,node3,10)
                .length(1000)
                .build();
        BasicLink fiberLink3 = new FiberLink.Builder("3",node3,node4,10)
                .length(1000)
                .build();
        BasicLink fiberLink4 = new FiberLink.Builder("4",node4,node5,10)
                .length(1000)
                .build();
        BasicLink fiberLink5 = new FiberLink.Builder("5",node5,node2,10)
                .length(1000)
                .build();
        fiberList.add(fiberLink1);
        fiberList.add(fiberLink2);
        fiberList.add(fiberLink3);
        fiberList.add(fiberLink4);
        fiberList.add(fiberLink5);
        /*//LayerRouteFinder layerRouteFinder = new LayerRouteFinder();

        List<BasicLink> layerRoute = layerRouteFinder.find(fiberList,commonNodeList,node1,node3, LayerString.FIBER,100);
        BasicLink wdm1 = new WDMLink.Builder("11",node1,node3).size(10).length(100).rate(100).layerRoute(layerRoute).build();*/

        return;
    }
}
