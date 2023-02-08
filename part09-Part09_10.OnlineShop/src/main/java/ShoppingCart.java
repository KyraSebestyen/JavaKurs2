import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void add(String product, int price) {
        boolean isInCart = false;
        for (Item item : items) {
            if (item.getName().equals(product)) {
                isInCart = true;
                break;
            }
        }
        if (isInCart) {
            for (Item item : items) {
                if (item.getName().equals(product)) {
                    item.increaseQuantity();
                    return;
                }
            }
        }
        items.add(new Item(product, 1, price));
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
