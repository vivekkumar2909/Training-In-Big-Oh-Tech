// GTI.java
public class GTI extends SolarInverter {
    public GTI(double current, double voltage) {
        super("GTI", current, voltage, new Battery(false), new Grid(true));
    }

    @Override
    public void displayDetails() {
        System.out.println("Inverter: " + name);
        System.out.println("Power: " + getPower() + " W");
        System.out.println("Battery: " + (battery.isAvailable() ? "Yes" : "No"));
        System.out.println("GRID On: " + (grid.isEnabled() ? "Yes" : "No"));
    }
}
