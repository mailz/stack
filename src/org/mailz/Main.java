package org.mailz;

/**
 * Created by ubick on 30.09.2014.
 */
public class Main {

public static void main(String args[]) throws StackException {

    GenericStack<String> stack = new GenericStack<>(5);
    //comment
    System.out.println();
    System.out.println(stack.isFull());
    System.out.println(stack.isEmpty());
    stack.push("dsadas");
    stack.push("dsadas");
    stack.push("dsadas");
    stack.push("dsadas");
    stack.push("dsadas");
    stack.push("dsadas");
    System.out.println();

    System.out.println(stack.isFull());
    System.out.println(stack.isEmpty());

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();


}

}
