package work;

import static work.Abs.abs;

public class AbsRun {
    public static void main(String[] args) {
        // value 변수에 5 할당
        int value = 5;
        System.out.println(value + "의 절대값: " + abs(value));// 절대값 계산, 출력
        //value 변수에 -10 할당
        value = -10;
        System.out.println(value+ "의 절대값: " + abs(value) );// 절대값 계산, 출력
        //5의 절대값: 5
        //-10의 절대값: 10
    }
}
