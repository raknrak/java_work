package org.study.lam.exam07;

public class RunnableEx {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i= 0; i < 10; i++){
                System.out.print(i);
            }
        };
//Thread thread 방식보다 Runnable runnable 방식을 더 많이 사용
//        Thread thread = new Thread(()-> {
//            for(int i=0; i < 10; i++){
//                System.out.print(i);
//            }
//        });
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
