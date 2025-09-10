public class Vivek {
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

        for (int i = 1; i <= 3; i++) {
            lot.addSpot(1, "L" + i, "LARGE");
            lot.addSpot(1, "H" + i, "HANDICAPPED");
        }
        for (int i = 1; i <= 3; i++) {

            lot.addSpot(1, "S" + i, "SMALL");
        }

        Entry entry = new Entry(lot, "Entry-1");
        Exit exit = new Exit(lot, "Exit-1");

        lot.showAvailableSpots();

        Ticket t1 = entry.takeTicket(new Vehicle("CAR", "UP-16-2787"));
        Ticket t2 = entry.takeTicket(new Vehicle("CAR", "HR-01-2389"));
        Ticket t3 = entry.takeTicket(new Vehicle("TRUCK", "JH-03-1235"));
        Ticket t4 = entry.takeTicket(new Vehicle("MOTORCYCLES", "HR-02-2345"));

        lot.showAvailableSpots();

        // Thread.sleep(1000);

        exit.scanAndPay(t1, "CASH");
        exit.scanAndPay(t2, "CARD");

        exit.scanAndPay(t3, "CASH");
        exit.scanAndPay(t4, "CARD");

        lot.showAvailableSpots();

    }
}