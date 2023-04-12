package com.ujiuye.enumdemo;

public enum WeekEnum {
    MON("星期一"){
        @Override
        public void show() {
            System.out.println("周一");
        }
    },TUE("星期二"){
        @Override
        public void show() {
            System.out.println("周二");
        }
    },MOD("星期三"){
        @Override
        public void show() {
            System.out.println("周三");
        }
    },THUR("星期四"){
        @Override
        public void show() {
            System.out.println("周四");
        }
    },FIR("星期五"){
        @Override
        public void show() {
            System.out.println("周五");
        }
    };
    private String name;


    //private WeekEnum (){}
    private WeekEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void show();
}
