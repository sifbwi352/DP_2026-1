package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.time.LocalDate;

public class LicenseCardFactory extends Factory {

    private int licenseCounter = 100;
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected synchronized Product createProduct(String holder) {
        LocalDate issued = LocalDate.parse(baseDate);
        String expiryDate = issued.plusYears(5).minusDays(1).toString();

        return new LicenseCard(holder, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("등록했습니다: " + product);
    }
    
}
