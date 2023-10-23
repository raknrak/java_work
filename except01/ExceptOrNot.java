package com.mystudy.work02.except01;

public class ExceptOrNot {
    static void method(boolean b) {
        try{
            System.out.println(1); // 항상 1 출력
            //true일때 throw함
            if(b) throw new ArithmeticException();
            //false일때 2 출력
            System.out.println(2); // 예외가 발생하면 실행되지 않는 문장
            //throw된 예외가 여기서 잡힘
        } catch (RuntimeException r) {
            System.out.println(3);
            //예외가 발생하여 3 출력후 메소드 종료후 finally로
            return;

        } catch (Exception e) {
            System.out.println(4);
            return;
            //catch에 리턴문이 있어 메소드를 종료하고 빠져나가도 finally 출력됨
        } finally {
            //예외발생여부에 관계없이 항상 실행되는 문장
            System.out.println(5);
        }
        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true); // 예외가 발생하면 1, 3, 5 출력
        method(false); // 예외가 발생하지 않으면 1, 2, 5, 6 출력
    }
}
