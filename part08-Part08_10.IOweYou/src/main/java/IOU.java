import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> owingNameAmount;

    public IOU() {
        owingNameAmount = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        owingNameAmount.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        return owingNameAmount.getOrDefault(toWhom, 0.);
    }
}
