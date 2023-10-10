package work;

public class StudentCard {
    //카드 번호를 저장하는 정수형 변수'num'을 선언
    int num;
    //카드가 광인지를 나타내는 불린형 변수 'isKwang'을 선언
    boolean isKwang;
    //매개변수가 없는 기본 생성자
    StudentCard() {
        this(1, true);//StudentCard(1, true)를 호출한다.

    }
    //'num'과 'isKwang'을 매개변수로 받는 생성자
    StudentCard(int num, boolean isKwang){
        // 변수를 매개변수로 전달된 값으로 초기화함
        this.num=num;
        this.isKwang=isKwang;

    }
    //메서드 'info'는 학생 카드 정보를 문자열로 반환

    String info() { // 문자를 숫자열로 반환한다. 광인 경우 K를 덧붙인다
        return num + ( isKwang? "K" : "");
    }
}
