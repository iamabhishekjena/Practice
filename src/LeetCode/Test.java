package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class Test {
    Stack stackA = new Stack();
    Stack stackB = new Stack();


    public void add(int data){
        stackA.add(data);
    }

    public void delete(){
        while(stackA!=null){
            stackB.add(stackA.pop());
        }
        stackB.pop();
    }
}
