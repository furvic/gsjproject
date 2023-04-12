package com.ujiye.homework;

public class Teacher extends Person{
    private String job;
    private String dapart;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDapart() {
        return dapart;
    }

    public void setDapart(String dapart) {
        this.dapart = dapart;
    }

    @Override
    public void messagePrint() {
        System.out.println( getName() + "老师的编号是" + getNo() + "他在" + getDapart()+ "部门,他的职称是" + getJob() );
    }
}
