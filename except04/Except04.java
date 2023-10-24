package com.mystudy.work02.except04;

public class Except04 {
    public static void main(String[] args) {
        try{
            method1(); //예외 발생
            System.out.println(6); //예외가 발생해서 실행되지 않음
        } catch(Exception e){ // 모든 종류의 예외 처리
            System.out.println(7);
        }
    }
    static void method1() throws Exception{
        try{
            method2(); //method2()에서 NullpointException
            System.out.println(1);
        } catch(NullPointerException e){// 예외 처리
            System.out.println(2); // 2 출력
            throw e; // 예외를 다시 발생
        } catch(Exception e){// 예외가 다시 발행하여 가장 상위로 예외가 전달됨
            System.out.println(3);
        } finally {//finally는 항상 실행
            System.out.println(4);
        }
        System.out.println(5);// 예외가 발생하여 실행되지 않음
    }
    static void method2(){
        throw new NullPointerException();
    }
}
