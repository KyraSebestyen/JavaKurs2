import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public boolean take(String product) {
        if (stock(product) >= 1) {
            int stock = stocks.get(product);
            stock -= 1;
            stocks.put(product, stock);
            return true;
        }
        return false;
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }

    public Set<String> products() {
        Set<String> uniqueProducts = new HashSet<>();
        uniqueProducts.addAll(this.stocks.keySet());
        return uniqueProducts;
    }

}
