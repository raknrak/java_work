package work;
// 1+(1+2)+(1+2+3)+...+(1+2+...+10)의 결과
public class TotalStackSum {
    public static void main(String[] args) {
        int sum = 0;
        int totalsum = 0;

        for(int i=1; i<=10; i++) {
            sum +=i;
            // sum에 i를 더해 다시 sum 도출
            // i의 값을 누적해서 sum 도출
            totalsum +=sum;
            //totalsum에  sum을 더해 다시 totalsum 도출
            //도출된 각각의 sum 값을 다 더하면 totalsum 도출
        }

        System.out.println("totalsum="+totalsum); // 답은 220

    }
}
