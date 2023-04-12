package com.ujiuye.system;

public class Student {
    private String id;
    private String name;
    private int age;
    private String birth;

    public Student() {
    }

    public Student(String id, String name, int age, String birth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth='" + birth + '\'' +
                '}';
    }
}
