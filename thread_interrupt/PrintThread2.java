package org.study.run.exam05;

public class PrintThread2 extends Thread{
    public void run() {
        while(true) {
            //루프하면서 "실행 중" 출력
            System.out.println("실행 중 ");
            //Thread.interrupted() 메소드를 사용하여 interrupt 여부 확인
            if(Thread.interrupted()){
                //interrupt가 호출되면 루프를 탈출
                break;
            }
        }
        //루프를 탈출하고 종료되면 여기로 이동
        System.out.println("리소스 정리"); //"리소스 정리" 출력
        System.out.println("실행 종료");//"실행 종료" 출력
    }
}
