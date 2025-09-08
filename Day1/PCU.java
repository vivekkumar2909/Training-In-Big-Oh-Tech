// PCU.java
public class PCU extends SolarInverter {
    public PCU(double current, double voltage) {
        super("PCU", current, voltage, true, false);
    }

    @Override
    public void displayDetails() {
        System.out.println("Inverter: " + name);
        System.out.println("Power: " + getPower() + " W");
        System.out.println("Battery: " + (hasBattery ? "Yes" : "No"));
        System.out.println("GRID On: " + (gridOn ? "Yes" : "No"));
    }
}
