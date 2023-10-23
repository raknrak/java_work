package com.mystudy.work02.except02;

public class Except02 {

    public static void main(String[] args) {
        try {
            //메인 메소드가 method1()을 호출
            method1();
            //method1()이 호출한 예외를 처리하기 위해 여기에서 실행
        } catch (Exception e) {

            System.out.println(5);//예외 발생시 5 출력
        }
    }
    static void method1(){
        try{
            //method1()이 method2() 호출
            method2();
            System.out.println(1);
        } catch(ArithmeticException e){
            System.out.println(2);
            //method1()에는 catch가 없어 바로 finally로
        }finally {//finally는 항상 실행
            System.out.println(3);
        }
        System.out.println(4);
    } //method1()
    static void method2() {
        throw new NullPointerException();//예외 발생
    }
} //3, 5 출력
