import java.time.*;

public class Ticket {

    String id;

    // Delegation
    Vehicle vehicle;

    LocalDateTime inTime;

    LocalDateTime outTime;

    boolean paid = false;

    public Ticket(String id, Vehicle veh) {
        this.id = id;
        this.vehicle = veh;

        this.inTime = LocalDateTime.now();
    }

    Vehicle getVehicle() {
        return vehicle;
    }

    LocalDateTime getInTime() {
        return inTime;
    }

    String getId() {
        return this.id;
    }

    public void markIsPaid() {
        this.paid = true;
        this.inTime = LocalDateTime.now();
    }

    boolean isPaid() {
        return paid;
    }

    public Duration geDuration() {
        LocalDateTime end = paid ? this.outTime : LocalDateTime.now();
        return Duration.between(inTime, end);
    }

    // public Object getDuration() {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method
    // 'getDuration'");
    // }

}
