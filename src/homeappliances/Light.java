package homeappliances;

/**
 * Concrete class representing appliance : Light
 * The Fan class extends the abstract class Appliance & implements the switchOn() method,
 * providing the specific behavior for switching on a light.
 */
class Light extends Appliance {
    public Light() {
        super("Light", 2);
    }

    @Override
    public void switchOn() {
        System.out.println("Switching on the Light.");
    }
}
