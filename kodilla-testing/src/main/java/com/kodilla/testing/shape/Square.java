package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private int a;

    public Square(int a){
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return " Square ";
    }

    @Override
    public double getField() {
        return a*a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return a == square.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
