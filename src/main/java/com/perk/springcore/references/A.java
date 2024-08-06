package com.perk.springcore.references;

public class A {
    private int x;
    private B b;

    public A() {
    }

    public A(B b, int x) {
        this.b = b;
        this.x = x;
    }

    public B getB() {
        return b;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                ", x=" + x +
                '}';
    }

    public void setB(B b) {
        this.b = b;
    }

    public void setX(int x) {
        this.x = x;
    }
}
