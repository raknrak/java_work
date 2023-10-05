package work;
//1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인지 계산하시오
public class FibonnaciLoop {
    public static void main(String[] args) {
        //피보나치 수열은 첫항과 둘째 항은 1,1로 시작한다
        // 첫 번째 항 초기화
        int num1 = 1;
        //두 번째 항 초기화
        int num2 = 1;
        //다음 항의 값을 저장할 변수 초기화
        int num3 = 0;
        //처음 두 항을 출력함
        System.out.print(num1 +"," + num2);
        // 8번 박복 수행하여 피보나치 수열 계산
        for (int i = 0; i < 8 ; i++ ) {
            //다음 항은 현재항(num1)과 그 다음항(num2)의 합
            num3 = num1 + num2;
            //다음 항을 출력
            System.out.print("," + num3);
            //현재항(num1)을 다음항(num2)로 업데이트함
            num1 = num2;
            //다음항(num2)를 새로 계산된 항(num3)으로 업데이트함
            //이렇게 바복하면 이전 두 항이 새로 계산되는 항과 함께 다음 항으로 사용됨
            num2 = num3;

        }
    }
}
