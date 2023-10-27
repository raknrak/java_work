package com.mystudy.work02.thread01;

import java.util.Scanner;
import java.util.Vector;

public class Word {
    Vector words = new Vector(); // 단어를 저장하는 벡터
    String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};

    int interval = 2*1000; //2초

    WordGenerator wg = new WordGenerator(); // 단어를 생성하는 스레드

    public static void main(String[] args) {
        Word game = new Word(); //word 클래스의 인스턴스 생성
        game.wg.start(); // 단어를 생성하는 스레드 시작
        Vector words = game.words; // 단어를 저장하는 벡터

        while (true) {
            System.out.println(words); // 남아있는 단어 출력

            String prompt = ">>";
            System.out.println(prompt);

            Scanner s = new Scanner(System.in);

            String input = s.nextLine().trim(); // trim으로 앞,뒤 공백을 제거하고 사용자 단어 입력받기
            int index = words. indexOf(input); // 입력받은 단어를 words에서 찾음

            if(index !=-1){ // 찾은 경우
                words.remove(index); //words에서 해당 단어를 제거
            }
        }
    } //메인

    class WordGenerator extends Thread{
        public void run(){
            while(true){ //2초마다 배열 data의 값 중 하나를 임의로 선택
                int rand = (int) (Math.random()* data.length);
                words.add(data[rand]);//words에 저장

                try{
                    Thread.sleep(interval);//interval(2초)동안 쉼
                } catch(Exception e){}
            }
        }
    }
}
