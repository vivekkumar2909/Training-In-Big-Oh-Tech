public class FloorManagement {
    private ParkingLot lot;

    public FloorManagement(ParkingLot lot) {
        this.lot = lot;
    }

    public void createFloor(int floorNumber) {
        lot.addFloor(floorNumber);
    }

    public void addSpot(int floorNumber, String spotId, String type) {
        lot.addSpot(floorNumber, spotId, type);
    }

    public void showAvailableSpots() {
        lot.showAvailableSpots();
    }
}
