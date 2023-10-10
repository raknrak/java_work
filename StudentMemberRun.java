package work;
//1. 메서드명 : getTotal
//        기 능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
//        반환타입 : int
//        매개변수 : 없음
//2. 메서드명 : getAverage
//        기 능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
//        소수점 둘째자리에서 반올림할 것.
//        반환타입 : float
//        매개변수 : 없음

public class StudentMemberRun {
    public static void main(String[] args) {
        //StudentMember 클래스의 인스턴스 s를 생성
        StudentMember s = new StudentMember();
        //학생 정보를 인스턴스 변수에 할당
        s.name = "홍길동";    //학생의 이름
        s.ban = 1;          //학급
        s.no =1;            //학번
        s.kor = 100;        //국어 성적
        s.eng =60;          //영어 성적
        s. math =76;        //수학 성적


        System.out.println("이름: " + s.name); //이름: 홍길동
        System.out.println("총점:" + s.getTotal()); //총점: 236
        System.out.println("평균:" + s.getAverage()); // 평균: 78.7


    }
}
