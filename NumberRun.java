package work;

import static work.Number.isNumber;

public class NumberRun {
    public static void main(String[] args) {
        // 문자열 "123"을 정의하고 str 변수에 저장
        String str = "123";

        System.out.println(str+"는 숫자입니까? "+isNumber(str)); // "123"은 숫자
        // 문자열"123o"를 정의하고 str 변수에 저장
        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str)); //"123o"는 숫자가 아님
    }
}

