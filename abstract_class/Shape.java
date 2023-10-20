package com.mystudy.work02.abstract01;

abstract class Shape {
    Point p; //위치

    Shape () {
        //기본 생성자를 호출 시 원점에서 도형을 생성함
        this(new Point(0,0));
    }
    //주어진 포인트로 초기화
    Shape(Point p){
        this.p = p;
    }

    //면적을 계산하는 추상메소드
    abstract double calcArea () ;
    //원의 반지름, 사각형의 높이와 너비 반환
    Point getPosition(){
        return p;
    }
    // 반지름, 높이, 너비 설정
    void setPosition(Point p){
        this.p=p;
    }
}
