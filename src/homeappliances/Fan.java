package homeappliances;

/**
 * Concrete class representing appliance : fan
 * The Fan class extends the abstract class Appliance & implements the switchOn() method,
 * providing the specific behavior for switching on a fan.
 */
class Fan extends Appliance {
    public Fan() {
        super("Fan", 1);
    }

    @Override
    public void switchOn() {
        System.out.println("Switching on the Fan.");
    }
}