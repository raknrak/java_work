package work;
/*메서드명 : abs
        기 능 : 주어진 값의 절대값을 반환한다.
        반환타입 : int
        매개변수 : int value*/
public class Abs {
    // value라는 매개변수를 받아서 정수 형태로 반환
    public static int abs(int value) {
        // value가 0보다 크거나 같으면 value가 이미 양수이거나 0 이므로 value 반환
        // value가 음수인 경우 -value의를 value(양수)로 만듦
        return value>=0 ? value : -value;
    }
}
