import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history = new ChangeHistory();

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.addToWarehouse(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        history.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount){
        double takenAmount = super.takeFromWarehouse(amount);
        history.add(this.getBalance());
        return takenAmount;
    }

    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }

    public String history(){
        return this.history.toString();
    }
}
