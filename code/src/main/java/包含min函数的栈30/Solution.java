package 包含min函数的栈30;

import java.util.Stack;

public class Solution {

    Stack<Integer>stack = new Stack<Integer>();
    Stack<Integer>minStack = new Stack<Integer>();

    public void push(int node) {
        if(stack.empty()){
            stack.push(node);
            minStack.push(node);
        }else {
            stack.push(node);
            int min = minStack.pop();
            if(node<min){
                minStack.push(min);
                minStack.push(node);
            }else {
                minStack.push(min);
                minStack.push(min);
            }
        }
    }

    public void pop() {
        minStack.pop();
        stack.pop();
        return;
    }

    public int top() {
        int a = stack.pop();
        stack.push(a);
        return a;
    }

    public int min() {
        int min = minStack.pop();
        minStack.push(min);
        return min;
    }
}
