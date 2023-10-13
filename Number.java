package work;

public class Number {
    //
    public static boolean isNumber(String str) {
        // 문자열이 null 이거나 비어있으면 숫자가 아님
        if(str==null || str.equals(""))
            return false;
        // 문자열을 검사하여 숫자가 아닌 문자가 있으면 false 반환
        for(int i=0; i< str.length();i++) {
            // 문자열의 각 문자를 ch변수에 저장
            char ch = str.charAt(i);
            //'0'보다 작거나 '9'보다 크면 false 반환
            if(ch < '0' || ch > '9') {
                return false;
            }
        } // for
//        문자열이 숫자인 경우 true 반환
        return true;
    }
}
