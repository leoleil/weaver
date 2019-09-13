package cn.edu.bupt.ipoc.onps.model.po;

public class UserPO {
    private String id;

    private String name;

    private String password;

    public UserPO(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public UserPO() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}