import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        int currentWeight = 0;
        for (Item thing : items) {
            currentWeight += thing.getWeight();
        }
        if (currentWeight + item.getWeight() <= capacity) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
    }
}
