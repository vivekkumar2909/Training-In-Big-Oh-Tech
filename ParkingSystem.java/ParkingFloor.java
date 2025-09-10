import java.util.*;

public class ParkingFloor {
    private int numbers;

    final List<ParkingSpot> spots = new ArrayList();

    public ParkingFloor(int numbers) {
        this.numbers = numbers;
    }

    public void addSpots(ParkingSpot spot) {
        spots.add(spot);
    }

    public ParkingSpot FindSpot(Vehicle veh) {
        for (ParkingSpot s : spots) {
            if (s.isFreeSpot() && s.isCanFitInParking(veh)) {
                return s;
            }
        }

        return null;
    }

    public void showFreeSpots() {
        System.out.println("Floor " + numbers + " free spots:");
        for (ParkingSpot s : spots) {
            if (s.isFreeSpot()) {
                System.out.println(" - * - " + s.getNo() + " (" + s.getTypeOfVehicle() + ") " + " - * - ");
            }
        }
    }

}
