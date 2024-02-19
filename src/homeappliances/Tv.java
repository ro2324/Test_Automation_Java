package homeappliances;

/**
 * Concrete class representing appliance : Tv
 * The Fan class extends the abstract class Appliance & implements the switchOn() method,
 * providing the specific behavior for switching on a tv.
 */
class Tv extends Appliance {
    public Tv() {
        super("TV", 3);
    }

    @Override
    public void switchOn() {
        System.out.println("Switching on the TV.");
    }
}

