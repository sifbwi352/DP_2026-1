package hw.ch02;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220739 이름: 이지예");
        
        // 기존 한국 콘센트 객체 생성
        KoreanOutlet koreanOutlet = new KoreanOutlet();
        // 콘센트를 Charger 인터페이스로 변환하는 어댑터 생성
        Charger chargerAdapter = new KoreanOutletAdapter(koreanOutlet);
        
        // 스마트폰은 Charger 인터페이스를 통해 충전
        Smartphone smartphone = new Smartphone(chargerAdapter);
        smartphone.charge();
    }
}
