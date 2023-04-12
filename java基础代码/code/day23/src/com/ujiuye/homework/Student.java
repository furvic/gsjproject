package com.ujiuye.homework;

public class Student implements Comparable<Student>{
    String name;
    int china;
    int math;
    int english;
    int total;

    public Student() {
    }

    public Student(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public Student(String name, int china, int math, int english) {
        this.name = name;
        this.china = china;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChina() {
        return china;
    }

    public void setChina(int china) {
        this.china = china;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", total=" + total +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
