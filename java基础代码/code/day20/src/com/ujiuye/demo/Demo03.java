package com.ujiuye.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        getPerson();
        readPerson();
      /*  FileOutputStream fos = new FileOutputStream("abc.txt");
        fos.write("张赛男".getBytes());
        fos.close();*/
        Person p = new Person();
        System.out.println(p.getSex());
    }
    public static void getPerson()throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("person.txt")
        );
        Person p = new Person("张三",23,"nv");
        Person p1 = new Person("莉莉丝",22,"nn");
        oos.writeObject(p);
        oos.writeObject(p1);
        /*ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",23,"nv"));
        list.add(new Person("莉莉丝",22," "));
        oos.writeObject(list);*/
        oos.close();

    }
    public static void readPerson() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("person.txt")
        );
        Person p = (Person) ois.readObject();
        System.out.println(p.getName() + "  " + p.getAge() + "   " + p.getSex());
        Person p1 = (Person)ois.readObject();
        System.out.println(p1);

        /*ArrayList<Person> list = (ArrayList<Person>)ois.readObject();
        for(Person p : list){
            System.out.println(p);
        }*/

        ois.close();
    }
}
