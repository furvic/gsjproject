package src.guo.pojo;

import java.io.Serializable;

public class Node implements Serializable {
    int data;
    Node next;
    Node (int data){
        this.data = data;
    }
}
