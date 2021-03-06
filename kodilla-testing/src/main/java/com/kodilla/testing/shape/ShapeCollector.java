package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private List<Shape> shapeList;

    public ShapeCollector(){
        shapeList = new ArrayList<Shape>();
    }

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape){
        shapeList.remove(shape);
    }

    public Shape getFigure(int n){
        return shapeList.get(n);
    }

    public String showFigures(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Shape e: shapeList){
            stringBuilder.append(e.getShapeName());
        }
        return stringBuilder.toString();
    }

    public List<Shape> getShapeArray(){
        return shapeList;
    }
}
/*
Klasa ta przechowuje figury geometryczne w kolekcji ArrayList. Figury są następujące: kwadrat, koło, trójkąt
(oczywiście użyj angielskich nazw klas).
Utwórz interfejs Shape zawierający deklarację metod:
metoda zwracająca nazwę figury,
metoda zwracająca pole powierzchni tej figury.
Klasy figur implementują interfejs Shape oraz posiadają wszystkie wymagane przez interfejs Shape metody.
Klasa ShapeCollector ma cztery metody:
dodającą figurę do kolekcji,
usuwającą figurę z kolekcji,
pobierającą z kolekcji figurę z pozycji n listy,
zwracającą nazwy wszystkich figur w postaci jednego Stringa
 */