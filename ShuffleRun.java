package work;


import static work.Shuffle.shuffle;

public class ShuffleRun {
    public static void main(String[] args) {

        int[] original = {1,2,3,4,5,6,7,8,9};
        // 원래 배열을 출력
        System.out.println(java.util.Arrays.toString(original));

        // shuffle 메소드를 사용하여 배열을 섞음
        int[] result = shuffle(original);
        // 섞인 배열을 출력
        System.out.println(java.util.Arrays.toString(result));
    }
}
