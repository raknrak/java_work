package com.mystudy.objectclass;

public class HashCode {
    public static void main(String[] args) {
        //두 개의 객체를 생성하고 동일한 데이터로 초기화
        StudentOb s1 = new StudentOb(1, "홍길동");
        StudentOb s2 = new StudentOb(1, "홍길동");

        //해시코드가 동일한지 검사
        if (s1.hashCode() == s2.hashCode()) {
            //해시코드가 동일한 경우 데이터가 동일한지 검사
            if (s1.equals(s2)) {
                System.out.println("동등 객체입니다.");
            } else {
                System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
            }
        }else { // 해시코드가 다를 경우 동등 객체로 간주하지 않음
                System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
            }
        }

    }


