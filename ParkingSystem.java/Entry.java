
import java.util.UUID;

public class Entry {
    final ParkingLot lot;
    final String id;

    public Entry(ParkingLot lot, String id) {
        this.id = id;
        this.lot = lot;
    }

    public Ticket takeTicket(Vehicle v) {
        ParkingFloor f = lot.getFloor(1);
        if (f != null) {
            ParkingSpot spot = f.FindSpot(v);
            if (spot != null) {
                spot.park(v);
                Ticket t = new Ticket(UUID.randomUUID().toString(), v);
                System.out.println("[Entry " + id + "] Spot " + spot.getNo() + " assigned");
                return t;
            }
        }
        System.out.println("[Entry " + id + "] No spot available");
        return null;
    }
}
