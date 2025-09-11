import java.util.Map;

public class ATMBalanceService {
    private ATM atm;

    public ATMBalanceService(ATM atm) {
        this.atm = atm;
    }

    public int getTotalBalance() {
        int total = 0;
        for (Map.Entry<Integer, Notes> entry : atm.getNoteAvailable().entrySet()) {
            total += entry.getKey() * entry.getValue().getNotes();
        }
        return total;
    }

    public void printBalance() {
        System.out.println("Current Balance :");
        for (Map.Entry<Integer, Notes> entry : atm.getNoteAvailable().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().getNotes() + " notes");
        }
        System.out.println("Total Current Balance : " + getTotalBalance());
    }
}
