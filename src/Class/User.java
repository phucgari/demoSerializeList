package Class;


import java.io.Serializable;

public class User implements Serializable {
    private String id;
    private String name;
    private int num;
    public User(){}

    public User(String id, String name, int num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
