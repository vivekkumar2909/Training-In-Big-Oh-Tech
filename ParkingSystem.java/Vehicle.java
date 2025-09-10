public class Vehicle {
    private final String typeOfVehicle;
    private final String numberOfVehicle;

    public Vehicle(String typeOfVehicle, String numberOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.numberOfVehicle = numberOfVehicle;
    }

    public String getTypeVehicle() {
        return typeOfVehicle;
    }

    public String getNumber() {
        return numberOfVehicle;
    }
}
