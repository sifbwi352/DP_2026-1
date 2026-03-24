package hw.ch02;

public class KoreanOutletAdapter implements Charger {
    private KoreanOutlet outlet;

    public KoreanOutletAdapter(KoreanOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public int charge() {
        return outlet.provide();
    }
}
