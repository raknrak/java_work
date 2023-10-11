package work;

public class MyPointRun {
    public static void main(String[] args) {
        //MyPoint 클래스를 사용하여 p라는 객체를 생성하고 (1,1) 좌표로 초기화
        MyPoint p = new MyPoint(1,1);
        //p 객체의 getDistance 메소드를 호출하여 (2,2)와의 거기를 계산
        System.out.println(p.getDistance(2,2));
    }
}
