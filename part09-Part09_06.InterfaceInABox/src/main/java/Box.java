import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= maxCapacity) {
            items.add(item);
        }
    }

    public double weight() {
        double currentWeight = 0;
        for (Packable thing : items) {
            currentWeight += thing.weight();
        }
        return currentWeight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
