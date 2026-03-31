package practice.ch05;

// 싱글톤 패턴 적용하기
public class Singleton {
    // (3) Singleton 객체를 미리 하나 만들어 둠
    private static Singleton singleton = new Singleton(); // 클래스가 로딩될 때 객체가 하나 만들어짐

    // (1) 생성자를 private으로 선언하여 외부에서 객체 생성을 막는다.
    private Singleton() {
        System.out.println("Singleton 객체가 생성됩니다.");
    }

    // (2) Singleton 객체를 얻어갈 수 있는 메소드를 정의함
    public static Singleton getInstance() {
        return singleton;  // 미리 생성된 싱글톤 객체를 반환함
    }
}
