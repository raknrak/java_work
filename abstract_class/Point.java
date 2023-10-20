package com.mystudy.work02.abstract01;

class Point {
    int x;// x 저장
    int y;// y 저장

    Point() {
        //기본 생성자 호출시 (0,0)으로 초기화
        this(0,0);
    }
    Point(int x, int y) {
        this.x=x; // 주어진 x로  초기화
        this.y=y; // 주어진 y로 초기화
    }
    //x와 y를 문자열로 반환
    public String toString(){
        return "["+ x +", "+y+"]";
    }
}
