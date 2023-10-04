package work;

public class PlusMinusSum2 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        for (int i = 1; sum < 100; i++, s = -s) {
            num = i * s;
            sum += num;
        } // for문을 더 간략히 표현

        if (sum >= 100) // 총합이 100보다 같거나 크면 반복문을 빠져 나간다.
        //for문에 true 대신 sum<100 들어가면서 break 빠짐

        System.out.println("num=" + num);
        System.out.println("sum=" + sum);
    }
}