package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int currentHand = 0;

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(currentHand);
        currentHand = (currentHand + 1) % 3;
        return hand;
    }

    @Override
    public void study(boolean win) {
        // 학습하지 않는다
    }
}
