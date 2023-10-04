package work;
//1부터 20까지 정수 중 2 또는 3의 배수가 아닌 수의 총 합
public class NottwothreeSum {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i <=20; i++) {
            if(i%2 !=0 && i%3 !=0)
                // i가 2 또는 3의 배수가 아닐 때 sum에 i를 더함
                // &&는 두 연산자가 모두 true로 충족될 때 결과가 true로 출력
                sum +=i;
        }

        System.out.println("sum="+sum); // 답은 73
    }
}
