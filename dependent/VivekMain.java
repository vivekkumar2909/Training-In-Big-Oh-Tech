public class VivekMain {

    private BankCard bankCard;

    public VivekMain(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    void doPayment(int amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();
        BankCard bankCard1 = new DebitCard();
        VivekMain shop = new VivekMain(bankCard);
        VivekMain shop1 = new VivekMain(bankCard1);

        shop.doPayment(3000);
        shop1.doPayment(8000);

    }
}
