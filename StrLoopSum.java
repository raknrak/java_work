package work;
//12345문자열의 합을 구하기
public class StrLoopSum {
    public static void main(String[] args) {
        //str을 선언하고 12345로 초기화
        String str = "12345";
        //sum을 선언하고 0으로 초기화 함
        int sum = 0;
        //for루프를 시작하여 str문자를 순회함
        //i를 카운터로 사용하여 0부터 시작하여 각 반복마다 1씩 증가함

        for(int i = 0; i < str.length(); i++) {
            // str에서 현재 인덱스 i의 문자를 가져옴
            // '0'은 문자 0을 리터럴로 나타냄
            // 0을 뺄셈하면 문자를 해당 정수 값으로 변환
            // 결과는 sum에 누적되어 합산
            sum += str.charAt(i) - '0';

        }
        //sum의 최종값을 출력
        System.out.println("sum=" + sum);
    }
}
