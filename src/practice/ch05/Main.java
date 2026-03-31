package practice.ch05;

public class Main {
    public static void main(String[] args) {
        // Singleton s1 = new Singleton();  // 컴파일 에러: 생성자가 private이므로 객체 생성 불가
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        if (s2 == s3) {  // s2와 s3는 같은 객체를 참조하고 있는지 검사
            System.out.println("s2와 s3는 같은 Singleton 객체입니다.");
        } else {
            System.out.println("s2와 s3는 다른 객체입니다.");
        }

        System.out.println("s2의 값: " + s2);
        System.out.println("s3의 값: " + s3);

        // 싱글톤2 사용하기
        Singleton2 s4 = Singleton2.INSTANCE;  // Singleton2 객체 얻기
        s4.hello();  // Singleton2 객체의 hello 메소드 호출

    }
}
