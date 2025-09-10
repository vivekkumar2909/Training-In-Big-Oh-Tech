public class ParkingSpot {
    String No;
    String typeOfVehicle;
    Vehicle vehicle; // Delegation Design Pattern Here;

    public ParkingSpot(String No, String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.No = No;
    }

    public boolean isFreeSpot() {
        return (vehicle == null);
    }

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

    void park(Vehicle v) {
        this.vehicle = v;
    }

    void LeaveSpot() {
        this.vehicle = null;
    }

    String getNo() {
        return this.No;
    }

    String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }

}
