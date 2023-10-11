package work;

public class StudentHongRun {
    public static void main(String[] args) {
        StudentHong s = new StudentHong("홍길동", 1, 1, 100, 60, 76);
        //정보를 호출하여 info 메소드를 가져옴
        System.out.println(s.info());
    }
}
