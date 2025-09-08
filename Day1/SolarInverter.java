// SolarInverter.java
public abstract class SolarInverter extends Inverter implements SolarFeatures {
    protected boolean hasBattery;
    protected boolean gridOn;

    public SolarInverter(String name, double current, double voltage, boolean hasBattery, boolean gridOn) {
        super(name, current, voltage);
        this.hasBattery = hasBattery;
        this.gridOn = gridOn;
    }

    @Override
    public void chargeBattery() {
        if (hasBattery) {
            System.out.println(name + ": Charging battery with solar energy.");
        } else {
            System.out.println(name + ": No battery to charge.");
        }
    }

    @Override
    public void sellToGrid() {
        if (gridOn) {
            System.out.println(name + ": Selling extra energy to grid.");
        } else {
            System.out.println(name + ": GRID feature not available.");
        }
    }
}
