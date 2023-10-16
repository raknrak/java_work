package com.mystudy.objectclass;

public class SmartPhone2 {
    private String company; // 제조사를 저장하는 변수
    private String os;     // 운영체제를 저장하는 변수
    // 스마트폰 객체를 초기화하는데 사용된 생성자
    public SmartPhone2(String company, String os) {
        this.company = company; // 생성자에 제조사를 설정
        this.os = os; // 생성자에 운영체제를 설정
    }

    // Object의 toString() 메소드를 재정의해서
    // 제조사와 운영체제가 결합된 문자열을 리턴하도록 함
    @Override
    //제조사와 운영체제 정보를 결합한 분자열 반환
    public String toString() {
        return company + ", " + os;
    }
}
