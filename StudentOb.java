package com.mystudy.objectclass;

public class StudentOb {
    private int no; // 학생 번호를 저장하는 변수
    private String name; // 학생 이름을 저장하는 변수
    // 학생 객체를 초기화하는데 사용되는 생성자
    public StudentOb(int no, String name) {
        this.no = no; // 학생 번호 설정
        this.name = name; // 학생 이름 설정
    }
    // 학생 번호를 반환하는 메소드
    public int getNo() {
        return no;
    }
    // 학생 이름을 반환하는 메소드
    public String getName() {
        return name;
    }
// hashCode 재정의 코드를 주석으로 처리하면
// HashSetEx결과값이 1,1,2 ->1,2,3으로 바뀜
    //Object의 hashCode() 메소드를 재정의해서
    //학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴하도록 함
    //(번호와 이름이 같으면 동일한 해시코드가 생성됨
    @Override
    public int hashCode() {
        int hashCode = no + (name != null ? name.hashCode() : 0);
        return hashCode;
    }
    //Object 클래스의 equals() 메소드 재정의
    //객체간 동등성을 비교
    //번호와 이름이 같을 경우 같은 객체로 처리
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // 같은 객체일 경우 true 반환
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false; // 다른 객체일 경우 false 반환
        }
        //변환을 통해 비교 대상을 StudentOb로 변환
        StudentOb target = (StudentOb) obj;

        if (no == target.getNo() && (name != null ? name.equals(target.getName()) : target.getName() == null)) {
            return true; // 학생 번호와 이름이 같은 경우 true 반환
        }

        return false; // 다른 경우 false 반환
    }
}
/* 16이상 버전
public class StudentOb {
    private int no;
    private String name;

    public StudentOb(int no, String name) {
        this.no = no;
        this.name = name;
    }
    public int getNo( ){ return no;}
    public String getName() {return name;}

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof StudentOb target) {
            if(no == target.getNo() && name.equals(target.getName())){
                return true;
            }
        }
        return false;

    }
}*/


