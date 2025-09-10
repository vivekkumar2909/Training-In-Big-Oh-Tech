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

    // which vehicle ticket is now ruuning

    Vehicle getVehicle() {
        return vehicle;
    }

    // getting the time in which the car comes
    LocalDateTime getInTime() {
        return inTime;
    }

    // get the id of the ticket
    String getId() {
        return this.id;
    }

    // if the amount is paid get set the paid is done

    public void markIsPaid() {
        this.paid = true;
        this.inTime = LocalDateTime.now();
    }

    // checking the vehicle details whether it is paid or not
    boolean isPaid() {
        return paid;
    }

    // Calculating Exact Duration of the Vehicle
    public Duration geDuration() {
        LocalDateTime end = paid ? this.outTime : LocalDateTime.now();
        return Duration.between(inTime, end);
    }

}
