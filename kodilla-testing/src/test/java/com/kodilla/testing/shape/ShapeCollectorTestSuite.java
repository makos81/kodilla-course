package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Shape Collector Suite")
    class TestShapeCollector{
        @Test
        void testAddFigure(){
            //given
            Shape circle = new Circle(3);
            ShapeCollector shapeCollector = new ShapeCollector();
            //when
            shapeCollector.addFigure(circle);
            //then
            Assertions.assertTrue(shapeCollector.getShapeArray().size()==1);
        }

        @Test
        void testRemoveFigure(){
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(3);
            shapeCollector.addFigure(new Circle(3));
            //when
            shapeCollector.removeFigure(circle);
            //then
            Assertions.assertTrue(shapeCollector.getShapeArray().size()==0);
        }

        @Test
        void testGetFigure(){
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(3);
            shapeCollector.addFigure(circle);
            //when
            Shape expected = shapeCollector.getFigure(0);
            //then
            Assertions.assertTrue(circle.equals(expected));
        }

        @Test
        void testShowFigures(){
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(3));
            shapeCollector.addFigure(new Square(3));
            String expected = " Circle  Square ";
            //when
            String result = shapeCollector.showFigures();
            //then
            Assertions.assertEquals(expected, result);
        }
    }

    @DisplayName("Circle interface test")
    @Nested
    class TestCircle{
        @Test
        void testGetShapeName(){
            //Given
            Shape circle = new Circle(2);
            //When
            String expectedString = " Circle ";
            //Then
            Assertions.assertEquals(expectedString, circle.getShapeName());
        }
        @Test
        void testGetField(){
            //Given
            Shape circle = new Circle(2);
            //When
            double expectedField = Math.PI*2*2;
            //Then
            Assertions.assertEquals(expectedField, circle.getField());
        }
    }


    @DisplayName("Square interface test")
    @Nested
    class TestSquare{
        @Test
        void testGetShapeName(){
            //Given
            Shape square = new Square(2);
            //When
            String expectedString = " Square ";
            //Then
            Assertions.assertEquals(expectedString, square.getShapeName());
        }
        @Test
        void testGetField(){
            //Given
            Shape square = new Square(2);
            //When
            int expectedField = 4;
            //Then
            Assertions.assertEquals(expectedField, square.getField());
        }
    }

    @DisplayName("Triangle interface test")
    @Nested
    class TestTriangle{
        @Test
        void testGetShapeName(){
            //Given
            Shape triangle = new Triangle(2, 3);
            //When
            String expectedString = " Triangle ";
            //Then
            Assertions.assertEquals(expectedString, triangle.getShapeName());
        }
        @Test
        void testGetField(){
            //Given
            Shape triangle = new Triangle(2, 3);
            //When
            int expectedField = 3;
            //Then
            Assertions.assertEquals(expectedField, triangle.getField());
        }
    }
}

/*
Napisz testy sprawdzające metody klasy ShapeCollector. W swoich testach wykorzystaj klasy wewnętrzne i
adnotacje @Nested oraz @DisplayName
 */