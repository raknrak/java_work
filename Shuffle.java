package work;
//Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//        메서드명 : shuffle
//        기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//        처리한 배열을 반환한다.
//        반환타입 : int[]
//        매개변수 : int[] arr - 정수값이 담긴 배열
public class Shuffle {
    //shuffle 메소드는 정수 배열을 받아옴
    public static int[] shuffle(int[] arr) {
        // 입력 배열 'arr'이 null 이거나 비어 있을 경우 그대로 반환
        // 잘못된 입력에 대한 예외 처리가 가능해짐
        if (arr == null || arr.length == 0)
            return arr;
        // 배열을 순회하며 요소를 섞음
        for (int i = 0; i < arr.length; i++) {
            // 0 이상 1 미만의 난수를 생성하고 배열의 길이와 곱함
            // 배열의 유효한 인덱스로 변환함
            int j = (int) (Math.random() * arr.length);

            // arr[i]와 arr[j]의 값을 서로 바꾼다
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr; // 섞인 배열을 반환
    }
}

