package com.edu;
import java.util.Scanner;
import com.edu.nodes.*;


public class Main {
    private static AbstractNode generateFirst() {
        return new MultNode(
                new AddNode(new SimpleNode(5), new SimpleNode(2)),
                new AddNode(new SimpleNode(7), new SimpleNode(3)));
    }
    private static AbstractNode generateSecond() {
        return new AddNode(
                new MultNode(new SimpleNode(5), new SimpleNode(1)),
                new MultNode(new SimpleNode(0), new AddNode(new SimpleNode(15), new SimpleNode(2))));
    }
    public static void main(String[] args) {
        AbstractNode first = generateFirst();
        AbstractNode second = generateSecond();
        System.out.println("The first expression is: \n" + first.toString()
                + "\nValue is: " + first.calculate());
        System.out.println("The second expression is: \n" + second.toString()
                + "\nValue is: " + second.calculate());
    }
}