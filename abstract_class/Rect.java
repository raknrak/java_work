package com.mystudy.work02.abstract01;

class Rect extends Shape {
    double width; // 직사각형의 너비
    double height; // 직사각형의 높이

    Rect(double width, double height){
        // 기본 생성자 호출시 너비와 높이를 (0,0)으로 초기화
        this(new Point(0,0), width, height);
    }

    Rect(Point p, double width, double height){
        // 상위 클래스(Shape)의 생성자를 호출하여 위치 설정
        super(p);
        this.width=width; // 너비 설정
        this.height=height; // 높이 설정
    }
    boolean isSquare (){
        //높이와 너비가 0이 아니면서 높이와 너비가 같으면 true 반환
        return width*height!=0 && width==height;
    }
    double calcArea() {
        //면적을 계산하여 반환
        return width * height;
    }
}
