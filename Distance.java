package work;
// 두 점 (x,y)와 (x1, y1)간의 거리를 구한다.
// 제곱근 계산은 Math.sqrt(double a)를 사용
public class Distance {
    //정적 메소드: 두 점 (x, y)와 (x1, y1) 사이의 거리를 계산하여 반환
    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x-x1) * (x-x1) + (y - y1) * (y - y1));
    }
}
