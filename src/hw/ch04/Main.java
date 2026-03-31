package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;
import hw.ch04.license.LicenseCardFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220739 이름: 이지예");

        // 테스트 코드 (Step 1)
        Factory factory = new IDCardFactory("2026-01-15");
        Product card1 = factory.create("Kim Youngjin");
        Product card2 = factory.create("Son Heungmin");
        card1.use();
        card2.use();

        System.out.println();

        // 테스트 코드 (Step 2)
        Factory factory2 = new LicenseCardFactory("2026-03-20"); 
        Product license1 = factory2.create("Park Jisung"); 
        Product license2 = factory2.create("Lee Min-jae"); 
        license1.use(); 
        license2.use();
    }
}
