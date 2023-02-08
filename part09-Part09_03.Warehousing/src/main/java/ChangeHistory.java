import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> amountHistory;

    public ChangeHistory() {
        this.amountHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.amountHistory.add(status);
    }

    public void clear() {
        this.amountHistory.clear();
    }

    public double maxValue() {
        if (amountHistory.isEmpty()) {
            return 0.;
        }
        double max = 0;
        for (Double status : amountHistory) {
            if (status > max) {
                max = status;
            }
        }
        return max;
    }

    public double minValue() {
        if (amountHistory.isEmpty()) {
            return 0.;
        }
        double min = Double.MAX_VALUE;
        for (Double status : amountHistory) {
            if (status < min) {
                min = status;
            }
        }
        return min;
    }

    public double average() {
        if (amountHistory.isEmpty()) {
            return 0.;
        }
        double sum = 0;
        for (Double status : amountHistory) {
            sum += status;
        }
        return sum / amountHistory.size();
    }

    @Override
    public String toString() {
        return amountHistory.toString();
    }
}
