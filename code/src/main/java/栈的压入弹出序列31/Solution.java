package 栈的压入弹出序列31;

import java.util.ArrayList;
import java.util.Stack;



public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer>stack = new Stack<Integer>();
        for(int i=popA.length-1;i>=0;i--){
            stack.push(popA[i]);
        }
        Stack<Integer>stack1 = new Stack<Integer>();
        for (int i:pushA
             ) {
            stack1.push(i);
            while(!stack.empty()&&!stack1.empty()&&stack1.peek()==stack.peek()){

                stack.pop();
                stack1.pop();
            }
        }

        return  stack.empty();

    }
}
