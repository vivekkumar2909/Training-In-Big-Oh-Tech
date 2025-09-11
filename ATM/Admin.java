public class Admin {
    private ATM atm;

    public Admin(ATM atm) {
        this.atm = atm;
    }

    public void topUp(int denomination, int amount) {
        atm.topUp(denomination, amount);
    }

    public void printBalance() {
        atm.printBalance();
    }
}
