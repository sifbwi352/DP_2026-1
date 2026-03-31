package hw.ch04.idcard;


import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100;
    private String baseDate;
    private Map<Integer, String> database = new HashMap<>();

    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++, baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getSerial(), card.getOwner());
        System.out.println(product + "을 등록했습니다.");
    }

    public Map<Integer, String> getDatabase() {
        return database;
    }
}
