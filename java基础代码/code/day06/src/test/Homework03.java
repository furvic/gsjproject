package test;

public class Homework03 {
    public static void main(String[] args) {
        String s = toString(1 );
        System.out.println(s);
        String s1 = toString(0.3);
        System.out.println(s1);

        toString('d');
    }
    public static String toString(int i){
        return i +" " ;
    }
    public static String toString(double j){
        return j + " ";
    }
    public static void toString(char ch){
        System.out.println(ch + "");
    }
}
