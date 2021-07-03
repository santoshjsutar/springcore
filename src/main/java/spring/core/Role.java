package spring.core;

public class Role {

    private int id;
    private int level;
    private String role;

    public Role() {
    }

    public Role(int id, int level, String role) {
        this.id = id;
        this.level = level;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", level=" + level +
                ", role='" + role + '\'' +
                '}';
    }
}
