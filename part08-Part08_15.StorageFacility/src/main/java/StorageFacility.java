import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> unitAndItems;

    public StorageFacility() {
        this.unitAndItems = new HashMap<>();
    }

    public void add(String unit, String item) {
        ArrayList<String> items;
        if (unitAndItems.containsKey(unit)) {
            items = unitAndItems.get(unit);
        } else {
            items = new ArrayList<>();
        }
        items.add(item);
        unitAndItems.put(unit, items);
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> itemsInUnit = contents(storageUnit);
        itemsInUnit.remove(item);
        unitAndItems.put(storageUnit, itemsInUnit);
        if (unitAndItems.get(storageUnit).isEmpty()) {
            unitAndItems.remove(storageUnit);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        return unitAndItems.getOrDefault(storageUnit, new ArrayList<>());
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String unit : unitAndItems.keySet()) {
            if (!unit.isEmpty()) {
                storageUnits.add(unit);
            }
        }
        return storageUnits;
    }

}
