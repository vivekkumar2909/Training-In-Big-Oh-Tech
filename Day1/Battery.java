public class Battery {
    private boolean available;

    public Battery(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void charge(String inverterName, boolean solar) {
        if (available) {
            if (solar) {
                System.out.println(inverterName + ": Charging battery with solar energy.");
            } else {
                System.out.println(inverterName + ": Charging battery with home power.");
            }
        } else {
            System.out.println(inverterName + ": No battery to charge.");
        }
    }
}
