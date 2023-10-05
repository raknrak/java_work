package work;
//num값이 12345라면 1+2+3+4+5의 결과인 15를 출력
//문자열로 변환하지 말고 숫자로만 처리하기
public class WhileLoopSum {
    public static void main(String[] args) {
        //num 변수에 12345를 저장
        int num = 12345;
        //sum을 초기화
        int sum = 0;
        //while루프를 사용하여 num이 0보다 큰 동안 계속 반복함
        while(num> 0 ) {
            //num의 가장 오른쪽 자릿수르 추출하고, 추출한 자릿수를sum에 더함
            sum += num%10;
            //num을 10으로 나눈 몫으로 업데이트한 후 처리한 가장 오른쪽 자릿수를 제거함
            //num이 0이 될 때까지 반복
            num /=10;


        }
        System.out.println("sum=" +sum);


    }
}
