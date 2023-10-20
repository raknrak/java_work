package com.mystudy.work02.extendds;

public class ExtendsRun {
    public static void main(String[] args) {
        //Child 객체를 Parent 참조 변수에 할당
        Parent p = new Child();
        // Child 객체를 Child 참조 변수에 할당
        Child c = new Child();
        //p는 Child클래스의 인스턴스를 참조하지만
        //변수x와 method()는 Parent에서 정의한 것을 참조
        System.out.println("p.x = " + p.x);
        p.method();//Child클래스의 메소드 호출
        //p는 Child 클래스의 인스턴스를 참조하고있음
        //Child 클래스의 200이 출력됨
        System.out.println("c.x = " + c.x);
        c.method();//Child클래스의 메소드 호출
    }
}
