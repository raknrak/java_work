package work;

public class StudentHong {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    StudentHong(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor + eng + math;
    }
    float getAverage() {
        //평균을 계산할 때 정수 연산으로 인한 오차를 최소화하기 위해 소수점 첫째 자리에서 반올림
        //각 과목의 성적을 더하고 3으로 나누어 평균을 구함
        //그 결과 소수점 첫째 자리에서 반올림하여 반환
        //getTotal() / 3f는 세 과목의 성적 총합을 3으로 나눈 부동 소수점 수
        //이 값을 10을 곱하면 소수점 첫 자리 이하의 숫자를 소수점 첫 자리로 만들기 위해 곱하기 10을 함
        //0.5f를 더함으로써 반올림을 수행합니다. 이 값은 0.5를 더해주므로 소수점 이하 값이 0.5 이상인 경우에 반올림
        //10f로 나누어 소수점 첫 자리에서 반올림된 값을 다시 소수점 첫 자리로 나눔
        // 최종적으로 반환되는 값은 국어, 영어, 수학 성적의 평균으로, 소수점 첫 자리에서 반올림된 값이 됨
        return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
    }
    public String info() {
        return name
                +","+ ban
                +","+ no
                +","+ kor
                +","+ eng
                +","+ math
                +","+ getTotal()
                +","+ getAverage();
    }

}
