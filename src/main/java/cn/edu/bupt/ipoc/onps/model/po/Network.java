package cn.edu.bupt.ipoc.onps.model.po;

public class Network {
    private String id;

    private String name;

    private String type;

    private Integer level;

    private String upperNetworkId;

    private String projectId;

    public Network(String id, String name, String type, Integer level, String upperNetworkId, String projectId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.upperNetworkId = upperNetworkId;
        this.projectId = projectId;
    }

    public Network() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUpperNetworkId() {
        return upperNetworkId;
    }

    public void setUpperNetworkId(String upperNetworkId) {
        this.upperNetworkId = upperNetworkId == null ? null : upperNetworkId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }
}