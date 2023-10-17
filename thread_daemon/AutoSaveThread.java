package org.study.run.exam05;

public class AutoSaveThread extends Thread{
    public void save() {
        System.out.println("작업 내용을 저장함.");
    }

    @Override
    public void run() {
        while(true) {
            try {
                //스레드를 1초 동안 일시정지
                Thread.sleep(1000);
                //InterruptedException을 처리하는 예외 블록
            } catch (InterruptedException e){
                //스레드가 일시정지한 동안 interrupt되면 발생
                break;
            }
            // 1초마다 save()메소드를 호출하여 작업 내용을 저장
            save();
        }
    }
}
