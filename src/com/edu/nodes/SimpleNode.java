package com.edu.nodes;

public class SimpleNode implements AbstractNode {
    private final int value;
    public SimpleNode(int value) {
        this.value = value;
    }
    @Override
    public double calculate() {
        return value;
    }
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}