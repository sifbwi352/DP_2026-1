package hw.ch03;

public abstract class AbstractDisplay {
    // 반복 횟수 저장
    private int repeatCount;

    // 기본 생성자
    public AbstractDisplay() {
        this.repeatCount = 5;  // 기본값은 5로 설정
    }

    // 반복 횟수를 설정하는 메소드
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    // 큰 틀을 제공함 => 템플릿 메소드 패턴
    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}
