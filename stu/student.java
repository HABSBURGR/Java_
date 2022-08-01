package stu;

public class student {
    private String name;
    private String age;

    public student() {
    }

    public student(String name) {
        this.name = name;
    }

    public student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
