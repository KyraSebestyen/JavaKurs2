public class Item {

    private String name;
    private int quantityOfProducts;
    private int priceOfSingleProduct;

    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.quantityOfProducts = qty;
        this.priceOfSingleProduct = unitPrice;
    }

    public String getName() {
        return name;
    }

    public int price() {
        return quantityOfProducts * priceOfSingleProduct;
    }

    public void increaseQuantity() {
        quantityOfProducts++;
    }

    @Override
    public String toString() {
        return name + ": " + quantityOfProducts;
    }
}
