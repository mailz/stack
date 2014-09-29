package org.mailz;

import java.util.Collection;

/**
 * Created by ubick on 29.09.2014.
 */
public interface Stack<E> {
    // add new element to the top of the stack
    public void push(E element) throws StackException;

    // return and remove an element from the top
    public E pop() throws StackException;

    // return the top element but doesn’t remove
    public E peek();

    public int getSize();

    public boolean isEmpty();

    public boolean isFull();

    // add all elements from @src to the stack
    public void pushAll(Collection<? extends E> src) throws StackException;

    // pop all elements from stack to @dst
    public void popAll(Collection<? super E> dst) throws StackException;
}