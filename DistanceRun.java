package work;
// 두 점 (x,y)와 (x1, y1)간의 거리를 구한다.
public class DistanceRun {
    public static void main(String args[]) {
        // Distance 클래스의 정적 메서드인 getDistance를 호출
        double distance = Distance.getDistance(1,1,2,2);
        System.out.println(distance);//1.142135623730951
    }
}
