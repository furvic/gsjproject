package com.ujiuye.test;
/*
    第三题:
    定义：手机类Phone
    属性:品牌brand,价格price
    行为:查看手机信息look
    测试：创建3手机对象, 每个对象有不同的属性值, 输出属性值, 调用行为look方法


*/
public class Phone {
    String brand;
    double price;
    public void look(){
        System.out.println( brand +"这手机性能很好");
    }

}
