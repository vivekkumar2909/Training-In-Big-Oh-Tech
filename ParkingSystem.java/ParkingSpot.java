public class ParkingSpot {
    String No;
    String typeOfVehicle;
    Vehicle vehicle; // Delegation Design Pattern Here;

    public ParkingSpot(String No, String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.No = No;
    }

    // Checking the Free Spot if available or not
    public boolean isFreeSpot() {
        return (vehicle == null);
    }

    // Check the type of parking and car
    boolean isCanFitInParking(Vehicle v) {
        if (typeOfVehicle.equals("COMPACT") && v.getTypeVehicle().equals("CAR")) {
            return true;
        } else if (typeOfVehicle.equals("ELECTRIC") && v.getTypeVehicle().equals("CAR")) {
            return true;
        } else if (typeOfVehicle.equals("LARGE") && v.getTypeVehicle().equals("TRUCK")) {
            return true;
        } else if (typeOfVehicle.equals("HANDICAPPED") && (v.getTypeVehicle().equals("CAR") || v.getTypeVehicle()
                .equals("TRUCK"))) {
            return true;
        } else if (typeOfVehicle.equals("SMALL") && v.getTypeVehicle().equals("MOTORCYCLES")) {
            return true;
        } else {
            return false;
        }
    }

    // if vehicle is parked then its return the v;
    void park(Vehicle v) {
        this.vehicle = v;
    }

    // spot is now vacant for that car then null the vehicle ;
    void LeaveSpot() {
        this.vehicle = null;
    }

    // getting the parking number of the vehicle
    String getNo() {
        return this.No;
    }

    // after parking we are getting the vehicle number

    String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }

}
