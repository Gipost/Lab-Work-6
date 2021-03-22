package com.edu.nodes;

public class AddNode implements AbstractNode {
    private final AbstractNode left;
    private final AbstractNode right;
    public AddNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double calculate() {
        if (left.calculate() == 0)
        {
            return left.calculate();
        }
        else
        return left.calculate() + right.calculate();
    }
    public String toString() {
        String a = "+";
        String b = "";
        String c = "";
        String tleft = Character.toString(left.toString().charAt(0));
        String tright = Character.toString(right.toString().charAt(0));
        if ((tleft.equals(tright))== false)
        {
            b = b + " ";
            c = c + " ";
        }
        else if (tleft.equals("/") || tright.equals("/"))
        {
            b = b + " ";
            c = c + " ";
        }
        if (tleft.contains("/"))
        {
            b += left.toString();
        } else
            b += " " + left.toString();
        if (tright.contains("/"))
        {
            c += right.toString();
        } else
            c += " " + right.toString();
        return String.join("\n",a,b,c);
    }
}
