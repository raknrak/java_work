package work;
// 구구단 중 *3 까지만 가로로 출력하기
public class Gugudansam {
    public static void main(String[] args) {
        //1부터 9까지 반복문
          for(int i = 1; i <= 9; i++){
              //한 행에 3개의 곱셈식을 출력하기 위한 반복문
            for (int j = 1; j <= 3; j++) {
                // x와 y의 값을 계산
                // x는 현재 반복 i와 j에 따라 결정되며, 1부터 9까지 숫자 중 하나임
                int x = j + 1 + (i - 1) / 3 * 3;
                //y는 현재 반복 i에 따라 결정, 1,2,3중 하나
                int y = i%3 == 0? 3 : i%3;

                //x가 9보다 크면 반복 종료
                if(x >9)
                    break;
                //탭 문자로 각 곱셈식을 구분
                System.out.print(x+"*"+y+"="+x*y+"\t"); //println 아닌 print

            }
            //한 행의 곱셈식 출력이 끝나면 줄 바꿈
            System.out.println();
            //i가 3의 배수일 경우 3개의 곱셈식을 출력한 뒤 한 줄을 추가로 띄움
            if (i%3 == 0) System.out.println();
        }
    }
}


