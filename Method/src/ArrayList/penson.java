package ArrayList;

public class penson {
    private String name;
    private int age;


    public penson() {//无参数构造
    }


    public penson(String name, int age) {//全参构造
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
