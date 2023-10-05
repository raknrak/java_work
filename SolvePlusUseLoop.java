package work;
// 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
//0<=x<=10, 0<=y<=10 이다.
public class SolvePlusUseLoop {
    public static void main(String[] args) {
        //x를 0부터 10까지 반복해서 증가시킴
        for(int x = 0; x <= 10; x++) {
            //y를 0부터 10까지 반복해서 증가시킴
            for(int y = 0; y <= 10; y++) {
                //반복해서 증가시킨 값을 대입하여 10과 일치하는 x의 값과 y의 값을 찾아냄
                if(2*x + 4*y == 10) {
                    // 일치하는 값을 출력
                    System.out.println("x=" + x +", y=" +y);
                }
            }
        }


    }
}
