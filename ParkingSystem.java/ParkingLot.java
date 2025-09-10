import java.util.*;

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

    // here a floor for More Parking
    public void addFloor(int num) {
        floors.put(num, new ParkingFloor(num));
    }

    // In map store the type of parking with floor as a key

    public void addSpot(int floorNum, String id, String type) {
        floors.get(floorNum).addSpots(new ParkingSpot(id, type));
    }

    // Getting the floor number by ParkingFloor
    public ParkingFloor getFloor(int num) {
        return floors.get(num);
    }

    // This will run when its get paid in exit or entry
    public double calculateFee(Ticket t) {
        return pricing.calculateFee(t.geDuration());
    }

    public void processPayment(double amount, String method) {

        // Here its the Payment Processor Method to find the Amount
        processor.DoTransaction(amount, method);
    }

    // Showing the All Available space
    public void showAvailableSpots() {
        System.out.println("\n    Available Spots    ");
        for (ParkingFloor f : floors.values()) {
            f.showFreeSpots();
        }
        System.out.println("************#***************\n");
    }
}