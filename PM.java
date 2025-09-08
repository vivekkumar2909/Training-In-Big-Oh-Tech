
public class PM extends Minister {
    private String aircraftDriver;

    public PM(String name, String constituency, String carDriver, String aircraftDriver, double spendLimit) {
        super(name, constituency, carDriver,spendLimit);// prototype
        this.aircraftDriver = aircraftDriver;
    }

    @Override
    public String getVehicle() {
        return "Car (high security car) + Aircraft (chopper) (Special Permission and Liability)";
    }

    public String getAircraftDriver() {
        return this.aircraftDriver;
    }


    //pm can give permission to commissioner to arrest minister without any one permission 
    public boolean canGivePermissionToArrest(Minister minister) {
        System.out.println("pm can give permission to commissioner to arrest minister without any one permission ");
        return true; 
    }
}
