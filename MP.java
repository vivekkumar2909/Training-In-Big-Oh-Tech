
public class MP extends Politician {

    // created the driver for mp;
    private String driver;

    public MP(String name, String constituency, String driver, double spendLimit, boolean isPolitician) {

        // Mp have only 1 lakh limit to spend
        super(name, constituency, spendLimit, isPolitician);
        this.driver = driver;
    }

    @Override
    public String getVehicle() {
        return "Car (XUV)";
    }

    @Override
    public String getDriver() {
        return this.driver;
    }
}
