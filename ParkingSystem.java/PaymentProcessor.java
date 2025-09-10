public class PaymentProcessor implements PaymentMethod {
    @Override
    public void DoTransaction(double amount, String method) {
        System.out.println("Amount of : " + amount + " paid through " + method);
    }
}
