public class CreditCard implements BankCard {
    @Override
    public void doTransaction(int amount) {
        System.out.println("Amount is deducted from Credit Card : " + amount);
    }
}
