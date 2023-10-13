package work;
/*메서드명 : max
        기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
        만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
        반환타입 : int
        매개변수 : int[] arr - 최대값을 구할 배열*/
public class Maxint {
    // 정수 배열에서 최대값을 찾아 반환
    public static int max(int[] arr) {
        // 배열이 null이거나 길이가 0인 경우 -999999 반환
        if (arr == null || arr.length == 0)
            return -999999;
        //배열의 첫 번째 요소를 최대값으로 초기화
        int max = arr[0];
        // 배열을 반복하면서 최대값을 찾음
        for (int i = 1; i < arr.length; i++) {
            // arr[i]가 최대값(max)보다 큰 경우, 최대값을 현재 요소에 대입
            if (arr[i] > max)
                max = arr[i];
        }
        // 최대값 반환
        return max;
    }
}
