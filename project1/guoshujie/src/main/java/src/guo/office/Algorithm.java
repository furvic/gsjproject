package src.guo.office;

import src.guo.pojo.StackPojo;

import java.util.Stack;

public class Algorithm {


    public static void main(String[] args) throws Exception{
//        System.out.println(gcd(25, 5));
//        System.out.println(gcd1(27, 6));
//        System.out.println(gcd2(100, 50));
//        System.out.println(getGreatestCommonDivisor(20,13));

        StackPojo stack = new StackPojo();
        stack.push(3);
        stack.push(8);
        stack.push(5);
        stack.push(9);
        stack.push(0);
        stack.push(2);
        stack.push(7);
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());

        Node node1 = new Node(5);
        Node node2 = new Node(6);
        Node node3 = new Node(3);
        Node node4 = new Node(2);
        Node node5 = new Node(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;
        System.out.println(isCycle(node1));
    }


    /**
     * 判断是否有环
     */
    public static boolean isCycle(Node head){
        Node p1 = head;
        Node p2 = head;
        while (p2!=null&&p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1==p2){
                return true;
            }
        }
        return false;
    }


    private static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }
    /**
     * 移位算法
     */
    public static int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        if ((a & 1) == 0 && (b & 1) == 0) {
            return gcd(a >> 1, b >> 1) << 1;
        } else if ((a & 1) == 0 && (b & 1) != 0) {
            return gcd(a >> 1, b);
        } else if ((a & 1) != 0 && (b & 1) == 0) {
            return gcd(a, b >> 1);
        } else {
            int big = a > b ? a : b;
            int small = a < b ? a : b;
            return gcd(big - small, small);
        }
    }

    public static int gcd1(int a, int b) {
        if (a == b) {
            return a;
        }

        int big = a > b ? a : b;
        int small = a < b ? a : b;
        return gcd(big - small, small);

    }

    public static int gcd2(int a, int b) {

        int big = a > b ? a : b;
        int small = a < b ? a : b;
        if (big % small == 0) {
            return small;
        }
        return gcd(big % small, small);

    }

    public static int getGreatestCommonDivisor(int a, int b) {
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        if (big % small == 0) {
            return small;
        }
        for (int i = small / 2; i > 1; i--) {
            int j = small/2;
//            System.out.println(j);
            if (small % i == 0 && big % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
