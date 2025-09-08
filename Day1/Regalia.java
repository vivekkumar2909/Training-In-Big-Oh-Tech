// Regalia.java
public class Regalia extends SolarInverter {
    public Regalia(double current, double voltage,boolean hasBattery,boolean gridOn) {
        super("Regalia", current, voltage, hasBattery, gridOn);
    }

    @Override
    public void displayDetails() {
        System.out.println("Inverter: " + name);
        System.out.println("Power: " + getPower() + " W");
        System.out.println("Battery: " + (hasBattery ? "Yes" : "No"));
        System.out.println("GRID On: " + (gridOn ? "Yes" : "No"));
    }
}
