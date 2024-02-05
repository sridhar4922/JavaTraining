package com.training.day4;

import java.util.EmptyStackException;

public class IntegerStack {
    private int[] stackArray;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public IntegerStack() {
        stackArray = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(int element) {
        if (top == stackArray.length - 1) {
            // If the stack is full, double the capacity
            expandCapacity();
        }
        stackArray[++top] = element;
        System.out.println("Pushed: " + element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped: " + poppedElement);
        return poppedElement;
    }


    public boolean isEmpty() {
        return top == -1;
    }
    private void expandCapacity() {
        int newCapacity = stackArray.length * 2;
        int[] newStackArray = new int[newCapacity];
        System.arraycopy(stackArray, 0, newStackArray, 0, stackArray.length);
        stackArray = newStackArray;
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();
    }
}


/*

OUTPUT

Is stack empty? true
Pushed: 10
Pushed: 20
Pushed: 30
Is stack empty? false
Popped: 30
Popped: 20
Popped: 10
 */
