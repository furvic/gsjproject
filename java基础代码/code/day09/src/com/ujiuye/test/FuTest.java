package com.ujiuye.test;

public class FuTest {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.age);
        f.fun();
        //f.see();
        // f.name1;
        Zi z = (Zi)f;
        z.see();
        Fu f1 = new Son();
        if(f1 instanceof Son){
            Son s = (Son) f1;
            System.out.println("转型成功");
            s.feel();
        }else{
            System.out.println("无法强制转型");
        }





    }
}
