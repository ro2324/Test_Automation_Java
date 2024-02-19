package homeappliances;

// Abstract class representing an appliance
public abstract class Appliance {
    protected String name;
    protected int powerConsumption;

    public Appliance(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public abstract void switchOn();
}
