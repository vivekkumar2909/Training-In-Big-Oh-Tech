// GTI.java
public class GTI extends SolarInverter {
    public GTI(double current, double voltage) {
        super("GTI", current, voltage, false, true);
    }

    @Override
    public void displayDetails() {
        System.out.println("Inverter: " + name);
        System.out.println("Power: " + getPower() + " W");
        System.out.println("Battery: " + (hasBattery ? "Yes" : "No"));
        System.out.println("GRID On: " + (gridOn ? "Yes" : "No"));
    }
}
