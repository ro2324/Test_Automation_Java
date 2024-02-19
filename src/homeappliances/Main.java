package homeappliances;

public class Main {

    public static void main(String[] args) {

        Home home = new Home();
        home.addAppliances(new Fan());
        home.addAppliances(new Light());
        home.addAppliances(new Tv());

        for (Appliance appliance : home.getAppliances()) {
            appliance.switchOn();
        }
        int totalPower = home.calculatePowerConsumption();
        System.out.println("Total power consumption: " + totalPower + " units.");

        home.sortByPowerConsumption();
        System.out.println("Sorted appliances by power consumption:");

        for (Appliance appliance : home.getAppliances()) {
            System.out.println(appliance.name + " - " + appliance.getPowerConsumption() + " units");
        }
    }
}
