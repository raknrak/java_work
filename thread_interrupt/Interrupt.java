package org.study.run.exam05;

public class Interrupt {
    public static void main(String[] args) {
        //Thread 객체 생성
        Thread thread = new PrintThread();
        //스레드 시작
        thread.start();

        try {
            //스레드를 1초 동안 일시 정지시킴
            //sleep을 호출할 때는 항상 try-catch문으로 예외 처리
            Thread.sleep(1000);
            //InterruptedException을 처리하는 예외 블록
        } catch(InterruptedException e){
            //스레드가 sleep(1초 정지)중에 interrupt되면 발생
        }
        //interrupt() 메소드를 호출하여 스레드 종료
        thread.interrupt();
    }
}
