package work;
//for(int i=0; i<=10; i++) {
//        for(int j=0; j<=i; j++)
//        System.out.print("*");
//        System.out.println();
//while문으로 변경하기
public class ChangeFortoWhile {
    public static void main(String[] args) {
        int i=0;
        while(i<=10) { //i가 10 이하일 경우 까지 반복하므로 11회 반복
            int j=0; // true일 경우 계속해서 반복 후 false가 되면 종료
            while(j<=i) { // j와 i가 같아 질 떄까지 반복
                System.out.print("*"); //println이 아니라 print로 출력해야 붙어서 출력됨
                j++;
            }
            System.out.println();
            i++;
        }

// for문이 정해진 횟수만큼 반복한다면, while문은 조건식이 true일 경우에 계속해서 반복
    }
}
