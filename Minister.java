
public class Minister extends MP {

    // constructor for minister
    public Minister(String name, String constituency, String driver, double spendLimit, boolean isPolitician) {
        super(name, constituency, driver, spendLimit, isPolitician);
    }

    @Override
    public boolean getLimitExpend() {

        // i have used the politician expense logic
        return super.getLimitExpend();
    }

    @Override
    public String getVehicle() {
        return "Car (Minister For Verna)";
    }
}
