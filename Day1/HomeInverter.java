// HomeInverter.java
public class HomeInverter extends Inverter {
    private boolean hasBattery;

    public HomeInverter(String name, double current, double voltage) {
        super(name, current, voltage);
        // all non-solar inverters have battery
        this.hasBattery = true; 
    }

    public void chargeBattery() {
        System.out.println(name + ": Charging battery with home power.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Inverter: " + name);
        System.out.println("Power: " + getPower() + " W");
        System.out.println("Battery: " + (hasBattery ? "Yes" : "No"));
    }
}
