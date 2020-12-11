package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private int r;

    public Circle(int r){
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return " Circle ";
    }
    @Override
    public double getField(){
        return Math.PI*r*r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r == circle.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}
