package com.mystudy.work02.abstract01;

public class Circle extends Shape {
    double r;// 원의 반지름

    Circle(double r){
        //원점 (0,0)에서 반지름을 가진 원을 생성하는 생성자
        this(new Point(0,0), r);
    }
    Circle (Point p, double r) {
        //상위 클래스(Shape)의 생성자를 호출하여 원의 위치 설정
        super(p);
        this.r = r;//원의 반지름
    }
    double calcArea(){
        return Math.PI*r*r;//면적을 계산하여 반환
    }
}
