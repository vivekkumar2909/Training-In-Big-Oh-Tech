public class Main {
    public static void main(String[] args) throws InterruptedException {

        CalculatePriceBasedOnHour pricing = new CalculatePriceBasedOnHour();
        PaymentProcessor processor = new PaymentProcessor();
        ParkingLot lot = new ParkingLot("Central Lot", pricing, processor);

        lot.addFloor(1);

        for (int i = 1; i <= 5; i++) {
            lot.addSpot(1, "C" + i, "COMPACT");
        }
        for (int i = 1; i <= 3; i++) {
            lot.addSpot(1, "E" + i, "ELECTRIC");
        }
        lot.addSpot(1, "L1", "LARGE");
        lot.addSpot(1, "H1", "HANDICAPPED");

        Entry entry = new Entry(lot, "Entry-A");
        Exit exit = new Exit(lot, "Exit-1");

        lot.showAvailableSpots();

        Ticket t1 = entry.takeTicket(new Vehicle("CAR", "KA-01-111"));
        Ticket t2 = entry.takeTicket(new Vehicle("CAR", "KA-01-222"));

        lot.showAvailableSpots();

        Thread.sleep(1000);

        exit.scanAndPay(t1, "CASH");
        exit.scanAndPay(t2, "CARD");

        lot.showAvailableSpots();
    }
}