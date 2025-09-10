import java.util.*;

public class ParkingFloor {
    private int numbers;

    final List<ParkingSpot> spots = new ArrayList();

    public ParkingFloor(int numbers) {
        this.numbers = numbers;
    }

    // Add vehicle to given spot
    public void addSpots(ParkingSpot spot) {
        spots.add(spot);
    }

    // this help is finding if the space is available or not

    public ParkingSpot FindSpot(Vehicle veh) {
        for (ParkingSpot s : spots) {
            if (s.isFreeSpot() && s.isCanFitInParking(veh)) {
                return s;
            }
        }

        return null;
    }

    // this show all free spot
    public void showFreeSpots() {
        System.out.println("Floor " + numbers + " is free spots : ");
        for (ParkingSpot s : spots) {
            if (s.isFreeSpot()) {
                System.out.println("Number : " + s.getNo() + " " + s.getTypeOfVehicle() + " " + "is available");
            }
        }
    }

}
