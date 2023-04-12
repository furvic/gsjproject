package com.ujiuye.anni;
@Person(wife = "金莲" ,hunsband = "大郎")
public class PersonTest {
    public static void main(String[] args) {
         Class c = PersonTest.class;
         Person per = (Person)c.getAnnotation(Person.class);
        System.out.println(per.wife() + "让" + per.hunsband() + per.action());
    }
}
