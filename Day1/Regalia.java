// Regalia.java
public class Regalia extends SolarInverter {
    public Regalia(double current, double voltage, Battery battery, Grid grid) {
        super("Regalia", current, voltage, battery, grid);
    }

    @Override
    public void displayDetails() {
        System.out.println("Inverter: " + name);
        System.out.println("Power: " + getPower() + " W");
        System.out.println("Battery: " + (battery.isAvailable() ? "Yes" : "No"));
        System.out.println("GRID On: " + (grid.isEnabled() ? "Yes" : "No"));
    }
}
