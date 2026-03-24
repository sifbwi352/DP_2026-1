package practice.ch03;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    abstract protected void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    // 큰 틀을 제공함 => 템플릿 메소드 패턴
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
