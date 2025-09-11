public class Management {
    private ParkingLot lot;
    private AdminService adminService;
    private UserService userService;

    public Management() {
        CalculatePriceBasedOnHour pricing = new CalculatePriceBasedOnHour();
        PaymentProcessor processor = new PaymentProcessor();
        this.lot = new ParkingLot("College Parking", pricing, processor);

        this.adminService = new AdminService(lot);
        this.userService = new UserService(lot);
    }

    public void handleUser(User user) {
        if (user.isAdmin()) {
            System.out.println("Admin PAnel " + user.getName());
            adminService.setupParkingFloors(user);
            adminService.showAvailableSpots(user);
        } else {

            System.out.println("User Panel" + user.getName());
            Ticket ticket = userService.collectTicket(user, new Vehicle("CAR", "TEMP-" + user.getId()));
            adminService.showAvailableSpots(new Admin(0, "SystemAdmin", true)); // system admin can view
            userService.makePayment(user, ticket, "CASH");
        }
    }
}
