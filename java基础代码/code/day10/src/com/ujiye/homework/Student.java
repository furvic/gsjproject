package com.ujiye.homework;

public class Student extends Person{
    private String score;
    private int classNo;

    @Override
    public void messagePrint() {
        System.out.println( getName() + "学生的编号是" + getNo() + "他在" + getClassNo()+ "班级，他的成绩是" + getScore() );
    }

    public Student() {
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }
}
