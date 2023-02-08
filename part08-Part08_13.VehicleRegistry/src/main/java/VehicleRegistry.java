import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> licensePlatesAndOwners;

    public VehicleRegistry() {
        this.licensePlatesAndOwners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (licensePlatesAndOwners.get(licensePlate) == null) {
            licensePlatesAndOwners.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return licensePlatesAndOwners.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (licensePlatesAndOwners.containsKey(licensePlate)) {
            licensePlatesAndOwners.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp : licensePlatesAndOwners.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> distinctOwners = new ArrayList<>();
        for (String owner : licensePlatesAndOwners.values()) {
            if (!distinctOwners.contains(owner)) {
                distinctOwners.add(owner);
            }
        }
        for (String owner : distinctOwners) {
            System.out.println(owner);
        }
    }
}
