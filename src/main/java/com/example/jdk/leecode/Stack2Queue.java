package com.example.jdk.leecode;

import java.util.Stack;

//两个栈实现队列
public class Stack2Queue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int val) {
        stack1.push(val);
    }

    public int pop() {

        if (!stack2.isEmpty()) {
            return stack2.pop();
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        return stack2.pop();
    }


    public static void main(String[] args) {
        Stack2Queue stack2Queue = new Stack2Queue();

        stack2Queue.push(1);
        stack2Queue.push(2);
        stack2Queue.push(3);
        System.out.println(stack2Queue.pop());
        stack2Queue.push(4);
        System.out.println(stack2Queue.pop());


    }


}
