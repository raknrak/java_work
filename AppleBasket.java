package work;

import org.w3c.dom.ls.LSOutput;

public class AppleBasket   {
    public static void main(String[] args) {
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket =
                numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0); // 모든 사과를 담는데 필요한 바구니의 수
    /* int와 int 연산 결과는 int이므로 실수값이 나오지 않음
       사과의 개수를 바구니의 크기로 나눴을 때 나머지가 있으면 하나의 바구니가 더 필요함
       나머지 연산자(%)를 이용하여 나머지가 발생하나 확인하여, 나머지가 발생하면 바구니의 개수에 1을 더해줘야 함
       삼항 연산자? 1(true) : 0(false) */

        System.out.println("필요한 바구니의  :"+numOfBucket);


    }
}
