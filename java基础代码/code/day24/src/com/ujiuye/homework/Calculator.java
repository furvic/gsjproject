package com.ujiuye.homework;


import javax.swing.plaf.metal.MetalIconFactory;
import java.lang.reflect.Field;

public class Calculator {
    private Object Object;

    public Calculator() {
    }

    public Calculator(java.lang.Object object) {
        Object = object;
    }

    public java.lang.Object getObject() {
        return Object;
    }

    public void setObject(java.lang.Object object) {
        Object = object;
    }

    public Object add(Object leftValue, Object rightValue) {


        if(leftValue instanceof Integer && rightValue instanceof Integer){
            double sum = 0;
            Double left = ((Integer) leftValue).doubleValue();
            Double right = ((Integer) rightValue).doubleValue();
            sum = left + right;
            System.out.println(sum);
            return sum;
        }else if(leftValue instanceof Float && rightValue instanceof Float){
            double sum = 0;
            Double left = ((Float) leftValue).doubleValue();
            Double right = ((Float) rightValue).doubleValue();
            sum = left + right;
            System.out.println(sum);
            return sum;
        }else if(leftValue instanceof Double && rightValue instanceof Double){
            double sum = 0;
            Double le = (Double)leftValue;
            Double ri = (Double)rightValue;
            sum = le + ri;
            String ss = String.valueOf(sum);
            int n = ss.indexOf(".");
            String s = ss.substring(0,n+3);
            Double dou = Double.parseDouble(s);
            System.out.println(dou);
            return dou;
        }else {
            System.out.println("--------");
            return null;
        }
    }
}
