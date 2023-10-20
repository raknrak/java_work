package com.mystudy.work02.abstract01;

public class ShapeRun {
    public static void main(String[] args) {
        Rect rect = new Rect(4, 4);
        Circle circle = new Circle(7);

        System.out.println(circle.calcArea());
        System.out.println(rect.calcArea());

    }
}
