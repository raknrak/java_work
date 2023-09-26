package work;

public class TernaryOoperator {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num > 0 ? "양수": (num < 0 ? "음수" : "0"));
        /*삼항연산자를 사용하면 2가지 경우의 수 처리 가능
        삼항연산자에 삼항연산자를 포함시키면 3가지 경우 처리 가능
        num 값이 0보다 크면 '양수'를 출력하고 끝나지만
        num 값이 0보다 작거나 같으면 괄호안의 삼항연산자가 출력됨
        이때 num값이 0보다 작으면 '음수'가 출력되고
        그렇지 않으면 '0'이 출력된다.*/        
    }
}
