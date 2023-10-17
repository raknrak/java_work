package org.study.run.exam05;

public class PrintThread extends Thread{
    public void run() {
        try {
            //루프 하면서 "실행 중" 메시지 출력
            while(true) {
                System.out.println("실행 중");
                //스레드를 1밀리초(0.001초) 동안 일시 정지
                Thread.sleep(1);
            }
            //InterruptedException 처리하는 예외 블록
        }catch(InterruptedException e) {
            //스레드가 sleep 중에 interrupt 되면 발생
        }
        //InterruptedException이 발생하면 여기로 이동
        System.out.println("리소스 정리"); //"리소스 정리" 출력
        System.out.println("실행 종료");//"실행 종료" 출력
        }
    }




