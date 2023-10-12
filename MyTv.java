package work;

public class MyTv {
    // TV 전원 상태를 나타내는 변수
    boolean isPowerOn;
    // 채널과 볼륨을 나타내는 변수
    int channel;
    int volume;
    // 채널과 볼륨의 최대, 최소 값으로 상수 사용
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    // TV의 전원을 켜거나 끄는 메소드
    void turnOnOff() {
    //isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
        isPowerOn = !isPowerOn;
    }
    // 볼륨을 증가시키는 메소드
    void volumeUp() {
    //volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
        if (volume<MAX_VOLUME)
            volume++;
    }
    // 볼륨을 감소시키는 메소드
    void volumeDown() {
    //(3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
        if (volume>MIN_VOLUME)
            volume--;
    }
    // 채널을 증가시키는 메소드
    void channelUp() {
    // (4) channel의 값을 1증가시킨다.
    // 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else {
            channel ++;
        }
    }
    // 채널을 감소시키는 메소드
    void channelDown() {
    // (5) channel의 값을 1감소시킨다.
    // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
        if(channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else {
            channel--;
        }
    }
}
