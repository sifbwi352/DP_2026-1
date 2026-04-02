package practice.ch05.ex;

public class Main extends Thread {
    public static void main(String[] args) {
        // 스레드 객체 생성
        Main t1 = new Main("Thread-A");
        Main t2 = new Main("Thread-B");

        // 스레드에 시작 지시
        t1.start();
        t2.start();
    }

    // 스레드가 해야 할 일 작성
    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(getName() + ": " + s);  // 스레드 이름과 싱글톤 인스턴스의 주소 출력
    }

    public Main(String name) {
        super(name);  // 부모인 Thread의 생성자를 호출하여 스레드 이름 설정
    }
}
