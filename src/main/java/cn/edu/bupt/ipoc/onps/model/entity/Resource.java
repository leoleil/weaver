package cn.edu.bupt.ipoc.onps.model.entity;


import java.util.Set;

public class Resource {
    private Set<FiberLink> fiberLinks;
    private Set<WDMLink> wdmLinks;
    private Set<OTNLink> otnLinks;
    private Set<SDHLink> sdhLinks;
    private Set<CommonNode> commonNodes;
    private Set<Traffic> traffices;
    private Set<TrafficGroup> trafficGroups;
    private Set<Network> networks;
    private Set<Port> ports;
    private Set<Fiber> fibers;
    private Set<Wavelength> wavelengths;
    private Set<Timeslot> timeslots;
    private Set<SDHRing> sdhRings;
    private Set<Route> routes;
    private boolean isAlloc;//判断是否已经分配资源


}
