package com.mystudy.work02.except03;

public class Except03 {
    static void method(boolean b) {
        try {
            System.out.println(1);//항상 1을 출력
            if(b) System.exit(0); // 즉시 프로그램 종료
            // 예외가 발생하지 않으면 출력
            System.out.println(2);
            //RuntimeException 발생시 3 출력
        } catch(RuntimeException r){
            System.out.println(3);
            return; // 출력후 메소드 종료
        } catch(Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true); //0은 즉시 종료
        method(false); //
    }
}
