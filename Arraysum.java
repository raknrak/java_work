package work;
//arr에 담긴 모든 값을 더하기
public class Arraysum {
    public static void main(String[] args) {
        //정수형 배열 arr을 선언하고 초기화
        int [] arr = {10, 20, 30, 40, 50} ;
        // 배열 요소들의 합을 저장할 변수 초기화
        int sum = 0;
        //배열의 길이보다 작을 때 까지 배열을 반복해서 각 요소의 값을 합계에 더함
        //i가 0일 경우 10, 1일 경우 20으로 순차적 접근하는 방식으로 반복
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum="+sum);
    }
}
