import java.time.*;

public interface PriceStrategy {

    double calculateFee(Duration d);
}