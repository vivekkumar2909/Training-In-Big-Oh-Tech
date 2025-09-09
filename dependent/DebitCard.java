public class DebitCard implements BankCard {
    @Override
    public void doTransaction(int amount) {
        System.out.println("Amount is deducted from Debit Card : " + amount);
    }
}
