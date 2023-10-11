package work;

public class MyPoint {
    int x; //x 좌표를 저장하는 정수 변수
    int y; //y 좌표를 저장하는 정수 변수
    //생성자 메소드: 객체를 초기화함
    MyPoint(int x, int y) {
        //생성자에 전달된 x 값을 객체의 x필드에 저장
        this.x = x;
        //y 값을 객체의 y필드에 저장
        this.y = y;

    }
    //두 점 사이의 거리를 계산하는 메소드
    double getDistance (int x1, int y1) {
        //두 점 사이의 거리를 계산하여 반환
        return Math.sqrt((x-x1) * (x-x1) + (y-y1) * (y-y1));
    }
}
