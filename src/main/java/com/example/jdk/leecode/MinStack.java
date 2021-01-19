package com.example.jdk.leecode;

import java.util.Stack;

//两个栈实现最小值栈
public class MinStack {

    Stack<Integer> stack = new Stack<>();

    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {

        if (minStack.isEmpty() || minStack.peek() > val) {
            minStack.push(val);
        }

        stack.push(val);
    }

    public int pop() {

        Integer val = stack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }

        return val;
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(3);
        minStack.push(1);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }
}

