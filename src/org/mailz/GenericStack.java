package org.mailz;

import java.util.Collection;
import java.util.Objects;

/**
 * Created by ubick on 29.09.2014.
 */
public class GenericStack<E> implements Stack<E> {

    private int top;
    private int capacity;
    private E[] elements;

    public GenericStack() {
        this.elements = (E[]) new Object[10];
        this.capacity = 10;
        top = -1;
    }

    public GenericStack(int size) {
        this.elements = (E[]) new Object[size];
        this.capacity = size;
        top = -1;
    }


    @Override
    public void push(E element) throws StackException {
        if (top == elements.length - 1) {
            throw new StackException("Stack is full");
        }
        top++;
        elements[top] = element;
    }

    @Override
    public E pop() throws StackException {
        if (top == -1) {
            throw new StackException("Stack is empty");
        }

        E element = elements[top];
        elements[top] = null;
        top--;
        return element;
    }

    @Override
    public E peek() {
        return elements[top];
    }

    @Override
    public int getSize() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == elements.length - 1);
    }

    @Override
    public void pushAll(Collection<? extends E> src) throws StackException {
        for (E e : src){
            push(e);
        }
    }

    @Override
    public void popAll(Collection<? super E> dst) throws StackException {
        while (isEmpty()) {
            dst.add(pop());
        }
    }
}
