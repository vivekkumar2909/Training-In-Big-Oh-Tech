public class HandleTheProcess {
    private Entry entry;
    private Exit exit;

    public HandleTheProcess(ParkingLot lot, String entryGate, String exitGate) {
        this.entry = new Entry(lot, entryGate);
        this.exit = new Exit(lot, exitGate);
    }

    public Ticket collectTicket(Vehicle vehicle) {
        return entry.takeTicket(vehicle);
    }

    public void makePayment(Ticket ticket, String paymentMode) {
        exit.scanAndPay(ticket, paymentMode);
    }
}
