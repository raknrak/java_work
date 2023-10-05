package work;
//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수 출력
public class DoubleSix {
    public static void main(String[] args) {
        //주사위 하나가 1부터 6까지 반복 해서 던짐
        for(int i=1;i<=6;i++)
            //나머지 주사위가 1부터 6까지 반복 해서 던짐
            for(int j=1;j<=6;j++)
                // 주사위 두 개의 합이 6이 될 경우
                if(i+j==6)
                    System.out.println(i+"+"+j+"="+(i+j));
    }
}