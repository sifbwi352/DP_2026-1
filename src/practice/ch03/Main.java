package practice.ch03;

public class Main {
    public static void main(String[] args) {
        //CharDisplay d1 = new CharDisplay('H');
        AbstractDisplay d1 = new CharDisplay('H');  // 부모 타입으로 해도 가능
        d1.display();

        //StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");  // 부모 타입으로 해도 가능
        d2.display();
    }
}
