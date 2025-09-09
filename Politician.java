
//Abstract class to hide implement of the internal method;

abstract class Politician extends Person {
    // private String name;
    // private String Constituency;
    private double expense;
    private double spendLimit;

    public Politician(String name, String Constituency, double spendLimit, boolean isPolitician) {
        super(name, Constituency, isPolitician);
        this.expense = 0.0;
        // this.Constituency = Constituency;
        // this.name = name;
        this.spendLimit = spendLimit;

    }

    public boolean getLimitExpend() {
        return this.expense > this.spendLimit;
    }

    public void addExpense(double exp) {
        this.expense += exp;
    }

    public abstract String getVehicle();

    public abstract String getDriver();
}
