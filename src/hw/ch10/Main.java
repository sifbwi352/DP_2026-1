package hw.ch10;

public class Main {
    public static void main(String[] args) {
        System.err.println("학번: 20220739 이름: 이지예");
        System.out.println("===== RandomStrategy =====");
        Player player1 = new Player("Taro", new RandomStrategy(0));

        System.out.println("\n===== CyclicStrategy =====");
        Player player2 = new Player("Bob", new CyclicStrategy());

        System.out.println("===== CyclicStrategy 의 손가락 순환 =====");

        Strategy cyclic = new CyclicStrategy();

        for (int i = 0; i < 9; i++) {
            Hand hand = cyclic.nextHand();
            System.out.println((i + 1) + "번째: " + hand);
            cyclic.study(false); // 호출해도 영향 없음
        }

        System.out.println("\n===== 10번 게임 진행 결과 =====");

        for (int i = 0; i < 10; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            System.out.println((i + 1) + "번째 게임: "
                    + player1 + " -> " + nextHand1 + ", "
                    + player2 + " -> " + nextHand2);

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("\nTotal result:");
        System.out.println(player1);
        System.out.println(player2);
    }
}
