package com.ujiye.homework;

public class ComputerTest {
    public static void main(String[] args) {
        NoteComputer no = new NoteComputer();
        Mouse m = new Mouse();
        no.useUSB(m);
        System.out.println("________________________------------------------");
        KeyBorder k = new KeyBorder();
        no.useUSB(k);
        System.out.println("________________________------------------------");
        no.open();
        System.out.println("________________________------------------------");
        no.close();

    }
}
