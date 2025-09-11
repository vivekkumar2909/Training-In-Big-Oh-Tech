public class AdminService {

    private FloorManagement floorManager;

    public AdminService(ParkingLot lot) {
        this.floorManager = new FloorManagement(lot);
    }

    public void setupParkingFloors(Admin admin) {
        if (!admin.isAdmin()) {

            System.out.println(("Only Admin can manage floors!"));
        }

        floorManager.createFloor(1);

        for (int i = 1; i <= 5; i++) {
            floorManager.addSpot(1, "C" + i, "COMPACT");
        }
        for (int i = 1; i <= 3; i++) {
            floorManager.addSpot(1, "E" + i, "ELECTRIC");
        }
        for (int i = 1; i <= 3; i++) {
            floorManager.addSpot(1, "L" + i, "LARGE");
            floorManager.addSpot(1, "H" + i, "HANDICAPPED");
        }
        for (int i = 1; i <= 3; i++) {
            floorManager.addSpot(1, "S" + i, "SMALL");
        }
    }

    public void showAvailableSpots() {
        floorManager.showAvailableSpots();
    }
}
