package com.mystudy.objectclass;

public class ToStringEx {
    public static void main(String[] args) {
        // 클래스의 인스턴스를 생성하고 제조사와 운영체제의 정보를 초기화
        SmartPhone2 myPhone = new SmartPhone2("삼성전자", "안드로이드");

        //toString() 메소드 호출하여 스마트폰 정보를 문자열로 가져옴
        String strObj = myPhone.toString();
        // 스마트폰 정보를 출력
        System.out.println(strObj); // 삼성전자, 안드로이드

        //toString() 메소드 호출하여 스마트폰 정보를 출력
        System.out.println(myPhone);// 삼성전자, 안드로이드
    }
}
//