package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors = new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        int reading = (int) sensors.stream().mapToInt(Sensor::read).average().orElseThrow(() -> new IllegalStateException("Sensor is off or list is empty."));
        readings.add(reading);
        return reading;
    }

    public List<Integer> readings() {
        return readings;
    }
}
