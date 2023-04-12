package src.guo.pojo;

import java.io.Serializable;
import java.util.Stack;

public class StackPojo implements Serializable {
    private Stack<Integer> mainStack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    /**
     * 入栈操作
     * peek栈顶
     */
    public void push(int element){
        mainStack.push(element);
        if (minStack.empty()||element<=minStack.peek()){
            minStack.push(element);
        }
    }
    /**
     * 出栈操作
     */
    public Integer pop(){
        if (mainStack.peek().equals(minStack.peek())){
            minStack.pop();//出栈
        }
        return mainStack.pop();
    }

    /**
     * 获取栈的最小元素
     */
    public int getMin()throws Exception{
        if (mainStack.empty()){
            throw new Exception("stack is empty");
        }
        return minStack.peek();
    }

}
