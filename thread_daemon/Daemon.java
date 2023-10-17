package org.study.run.exam05;

public class Daemon {
    public static void main(String[] args) {
        //객체 생성
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        //스레드를 데몬 스레드로 설정함
        autoSaveThread.setDaemon(true);
        //스레드 시작
        autoSaveThread.start();

        try {
            // 스레디를 3초 동안 일시정지
            Thread.sleep(3000);
            //InterruptedException을 처리하는 예외 블록
        } catch (InterruptedException e) {
        }
        //메인 스레드 종료
        System.out.println("메인 스레드 종료");
    }
}
