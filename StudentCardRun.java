package work;

public class StudentCardRun {
    public static void main(String[] args) {
        //기본 생성자를 사용하여 StudentCard 객체를 만듦
        //StudentCard 클래스의 두 번째 생성자를 사용하여 card1 객체를 초기화
        //num은 3, isKwang은 false로 설정
        StudentCard card1 = new StudentCard(3, false);
        //StudentCard 클래스의 첫 번째 생성자를 사용하여 card2 객체를 초기화
        //num을 1로, isKwang을 true로 초기화
        StudentCard card2 = new StudentCard();

        System.out.println(card1.info()); // 3 출력
        System.out.println(card2.info()); // 1K 출력

    }
}
