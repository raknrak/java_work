package com.mystudy.work02.implement;

class Student implements Comparable {
    //학생 정보 저장
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank; // 전교등수
    int classRank; // 반등수
    //학생 정보 초기화 생성자
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
    }
    //총점을 반환하는 메소드
    int getTotal() {
        return total;
    }
    //평균을 계산하여 반환하는 메소드
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    //
    public int compareTo(Object o) {
        if(o instanceof Student) {
            Student tmp = (Student)o;
            return tmp.total - this.total;// 다른 학생의 총점과 비교
        } else {
            return -1; // 비교할 수 없는 경우
        }
    }
    //toString 메소드를 재정의하여 삭생 정보를 문자열로 반환
    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getAverage()
                +","+schoolRank
                +","+classRank // 새로추가
                ;
    }
}
