
class Exit {
    private final ParkingLot lot;
    private final String id;

    public Exit(ParkingLot lot, String id) {
        this.lot = lot;
        this.id = id;
    }

    public void scanAndPay(Ticket t, String method) {
        double fee = lot.calculateFee(t);
        lot.processPayment(fee, method);

        t.markIsPaid();

        System.out.println("Exit of : " + id + " Vehicle " +
                t.getVehicle().getNumber() +
                " paid " + fee);
    }
}
