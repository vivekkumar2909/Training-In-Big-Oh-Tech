import java.util.*;

public class ATMWithdrawService {
    private ATM atm;

    public ATMWithdrawService(ATM atm) {
        this.atm = atm;
    }

    public void withdraw(int amount) {
        if (amount % 100 != 0) {
            System.out.println("Amount must be a multiple of 100");
            return;
        }

        int totalBalance = new ATMBalanceService(atm).getTotalBalance();
        if (amount > totalBalance) {
            System.out.println("Insufficient balance. Available : " + totalBalance);
            return;
        }

        Map<Integer, Integer> dispensed = new TreeMap<>((a, b) -> b - a);
        int remaining = amount;

        for (int denom : new int[] { 2000, 500, 200, 100 }) {
            if (remaining == 0)
                break;
            Notes notes = atm.getNoteAvailable().get(denom);
            int availableNotes = notes.getNotes();
            int needed = remaining / denom;
            int toDispense = Math.min(needed, availableNotes);
            if (toDispense > 0) {
                dispensed.put(denom, toDispense);
                remaining -= toDispense * denom;
                notes.removeNotes(toDispense);
            }
        }

        if (remaining > 0) {
            System.out.println("Amount can’t be dispensed due to insufficient denominations.");
            // rollback
            for (Map.Entry<Integer, Integer> entry : dispensed.entrySet()) {
                atm.getNoteAvailable().get(entry.getKey())
                        .addNotes(entry.getValue() * entry.getKey());
            }
            return;
        }

        System.out.println("Notes Given:");
        for (Map.Entry<Integer, Integer> entry : dispensed.entrySet()) {
            System.out.println(entry.getValue() + " x " + entry.getKey());
        }
    }
}
