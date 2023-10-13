package work;

import static work.Maxint.max;

public class MaxintRun {
    public static void main(String[] args) {
        // 정수 배열을 정의하고 최기화
        int[] data = {3, 2, 9, 4, 7};
        //배열 내용 출력
        System.out.println(java.util.Arrays.toString(data));
        //최대값을 찾아 출력
        System.out.println("최대값: " + max(data));
        // null 배열에 대한 최대값을 찾아 출력
        System.out.println("최대값: " + max(null));
        // 빈 배열에 대한 최대값을 찾아 출력
        System.out.println("최대값: " + max(new int[]{})); // 크기가 0인 배열
        /*[3, 2, 9, 4, 7]
        최대값: 9
        최대값: -999999
        최대값:-999999*/
    }
}
