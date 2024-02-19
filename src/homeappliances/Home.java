package homeappliances;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The Home class encapsulates
 * the collection of appliances,
 * providing methods to add appliances,
 * retrieve the list of appliances,
 * calculate the total power consumption,
 * sort the appliances based on power consumption.
 */
public class Home {

    private final List<Appliance> appliances = new ArrayList<>();

    public void addAppliances(Appliance appliance) {
        appliances.add(appliance);
    }

    public int calculatePowerConsumption() {
        int totalPower = 0;

        for (Appliance appliance : appliances) {
            totalPower += appliance.getPowerConsumption();
        }
        return totalPower;
    }

    public void sortByPowerConsumption() {
        appliances.sort(Comparator.comparingInt(Appliance::getPowerConsumption));
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }
}
