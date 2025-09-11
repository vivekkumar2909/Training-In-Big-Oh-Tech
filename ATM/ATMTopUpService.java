public class ATMTopUpService {
    private ATM atm;

    public ATMTopUpService(ATM atm) {
        this.atm = atm;
    }

    public void topUp(int denomination, int amount) {
        if (!atm.getNoteAvailable().containsKey(denomination)) {
            System.out.println("Invalid denomination, Please Try again... : " + denomination);
            return;
        }
        atm.getNoteAvailable().get(denomination).addNotes(amount);
    }
}
