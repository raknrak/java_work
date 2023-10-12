package work;

public class MyTvRun {
    public static void main(String[] args) {
        // MyTv 객체 생성
        MyTv t = new MyTv();
        // 채널과 볼륨 초기 설정
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+ t.channel+", VOL:" + t.volume);
        // 채널을 감소시키고 볼륨을 감소
        t.channelDown(); // 현재 채널을 1 감소
        t.volumeDown();  // 현재 볼륨을 1 감소
        System.out.println("CH:"+ t.channel+", VOL:" + t.volume);
        // 볼륨을 최대로 설정하고, 채널과 불륨을 증가
        t.volume = 100;
        t.channelUp(); // 현재 채널을 1 증가
        t.volumeUp(); // 현재 볼륨을 1 증가
        System.out.println("CH:"+ t.channel+", VOL:" + t.volume);
    }
}
