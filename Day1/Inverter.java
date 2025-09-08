// Inverter.java
public abstract class Inverter {
    protected String name;
    protected double current;          // in Amps
    protected double operatingVoltage; // in Volts

    public Inverter(String name, double current, double operatingVoltage) {
        this.name = name;
        this.current = current;
        this.operatingVoltage = operatingVoltage;
    }

    public double getPower() {
        return current * operatingVoltage; // Power = Current * Voltage
    }

    // abstract method to get the power when required
    public abstract void displayDetails();
}
