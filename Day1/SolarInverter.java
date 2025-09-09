// SolarInverter.java
public abstract class SolarInverter extends Inverter implements SolarFeatures {

    protected Battery battery;
    protected Grid grid;

    public SolarInverter(String name, double current, double voltage, Battery battery, Grid grid) {
        super(name, current, voltage);
        this.battery = battery;
        this.grid = grid;
    }

    @Override
    public void chargeBattery() {

        battery.charge(this.name, true);

        System.out.println(this.name + " is now running");
    }

    @Override
    public void sellToGrid() {
        grid.sellPower(name);
    }
}
