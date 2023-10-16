package com.mystudy.objectclass;
//HashSet java.util 패키지에 있으므로 import
import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        HashSet hashSet = new HashSet();

        StudentOb s1 = new StudentOb(1, "홍길동");
        //hashSet에 Student 객체 저장
        hashSet.add(s1);
        System.out.println("저장된 객체 수: " + hashSet.size());

        StudentOb s2 = new StudentOb(1, "홍길동");
        //hashSet에 Student 객체 저장
        hashSet.add(s2);
        System.out.println("저장된 객체 수: " + hashSet.size());

        StudentOb s3 = new StudentOb(2, "홍길동");
        //hashSet에 Student 객체 저장
        hashSet.add(s3);
        System.out.println("저장된 객체 수: " + hashSet.size());

    }
}
