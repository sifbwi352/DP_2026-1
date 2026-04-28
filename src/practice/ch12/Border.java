package practice.ch12;

public abstract class Border extends Display {
    protected Display display;  // 장식 내용물 (장식 대상): Display는 부모 타입

    protected Border(Display display) { // 인스턴스 생성 시 '내용물'을 인수로 지정
        this.display = display;
    }
}
