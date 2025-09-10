import java.util.*;
// import java.time.*;

public class ParkingLot {
    private final String name;
    private final Map<Integer, ParkingFloor> floors = new HashMap<>();
    private final CalculatePriceBasedOnHour pricing;
    private final PaymentProcessor processor;

    public ParkingLot(String name, CalculatePriceBasedOnHour pricing, PaymentProcessor processor) {
        this.name = name;
        this.pricing = pricing;
        this.processor = processor;
    }

    public void addFloor(int num) {
        floors.put(num, new ParkingFloor(num));
    }

    public void addSpot(int floorNum, String id, String type) {
        floors.get(floorNum).addSpots(new ParkingSpot(id, type));
    }

    public ParkingFloor getFloor(int num) {
        return floors.get(num);
    }

    // This will run when its get paid in exit or entry
    public double calculateFee(Ticket t) {
        return pricing.calculateFee(t.geDuration());
    }

    public void processPayment(double amount, String method) {
        processor.DoTransaction(amount, method);
    }

    public void showAvailableSpots() {
        System.out.println("\n--- Available Spots ---");
        for (ParkingFloor f : floors.values()) {
            f.showFreeSpots();
        }
        System.out.println("-----------------------\n");
    }
}