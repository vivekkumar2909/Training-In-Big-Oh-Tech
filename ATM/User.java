public class User {
    private ATM atm;

    int currentBalance = 50000;

    public User(ATM atm) {
        this.atm = atm;
    }

    public void withdraw(int amount) {
        currentBalance -= amount;
        // System.out.println("CurrentBalance of User : " + this.currentBalance);
        atm.withdraw(amount);
    }

    public void printBalance() {
        atm.printBalance();
    }

    public int getCurrentBalance() {
        System.out.println("CurrentBalance of User : " + this.currentBalance);
        return this.currentBalance;
    }

    void setCurrentBalance(int amount) {
        this.currentBalance = amount;
    }

}
