public class ATMDenominationService {
    private ATM atm;

    public ATMDenominationService(ATM atm) {
        this.atm = atm;
    }

    public void banDenomination(int denomination) {
        if (atm.getNoteAvailable().containsKey(denomination)) {
            atm.getNoteAvailable().remove(denomination);
            System.out.println("Denomination of Note " + denomination + " has been banned now.");
        } else {
            System.out.println("Denomination of Note " + denomination + " not found.");
        }
    }

    public void addDenomination(int denomination, Notes notes) {
        atm.getNoteAvailable().put(denomination, notes);
        System.out.println("Denomination " + denomination + " has been added.");
    }
}
