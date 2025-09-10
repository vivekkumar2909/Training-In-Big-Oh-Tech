import java.time.Duration;

public class CalculatePriceBasedOnHour implements PriceStrategy {
    @Override
    public double calculateFee(Duration d) {
        long dur = Math.max(1, (d.toMinutes() + 59) / 60);
        int ToPay = 0;

        if (dur >= 1) {
            ToPay += 4;
        }
        if (dur >= 2) {
            ToPay += 3.5;
        }
        if (dur >= 3) {
            ToPay += 3.5;
        }
        if (dur > 3) {
            ToPay += (dur - 3) * 2.5;
        }
        return ToPay;
    }
}
