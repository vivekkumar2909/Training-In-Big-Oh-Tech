public class UserService {
    private HandleTheProcess handleTheProcess;

    public UserService(ParkingLot lot) {
        this.handleTheProcess = new HandleTheProcess(lot, "Entry-1", "Exit-1");
    }

    public Ticket collectTicket(Vehicle vehicle) {
        return handleTheProcess.collectTicket(vehicle);
    }

    public void makePayment(Ticket ticket, String paymentMode) {
        handleTheProcess.makePayment(ticket, paymentMode);
    }
}
