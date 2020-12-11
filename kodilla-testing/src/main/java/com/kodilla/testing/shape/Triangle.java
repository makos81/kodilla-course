package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private int a;
    private int h;

    public Triangle(int a, int h){
        this.a = a;
        this.h = h;
    }

    @Override
    public double getField(){
        return 0.5*a*h;
    }

    @Override
    public String getShapeName(){
        return " Triangle ";
    }

    public int getA(){
        return a;
    }

    public int getH(){
        return h;
    }

    @Override
    public boolean equals(Object o){
        if(o==this)
            return true;
        if(o==null || this.getClass()!=o.getClass())
            return false;
        Triangle shape = (Triangle)o;
        return shape.getA()==this.getA() && shape.getH()==this.getH();
    }

}
