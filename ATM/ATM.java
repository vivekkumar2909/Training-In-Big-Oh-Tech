import java.util.*;

public class ATM {
    private Map<Integer, Notes> NoteAvailable;

    public ATM() {
        NoteAvailable = new HashMap<>();
        NoteAvailable.put(2000, new Notes2000());
        NoteAvailable.put(500, new Notes500());
        NoteAvailable.put(200, new Notes200());
        NoteAvailable.put(100, new Notes100());
    }

    public void topUp(int TypeOfNote, int amount) {
        if (!NoteAvailable.containsKey(TypeOfNote)) {
            System.out.println("Invalid TypeOfNote, Please Try again... : " + TypeOfNote);
            return;
        }
        NoteAvailable.get(TypeOfNote).addNotes(amount);
    }

    public void withdraw(int amount) {
        if (amount % 100 != 0) {
            System.out.println("Amount must be a multiple of 100");
            return;
        }

        int totalBalance = getTotalBalance();
        if (amount > totalBalance) {
            System.out.println("Insufficient balance. Available : " + totalBalance);
            return;
        }

        Map<Integer, Integer> dispensed = new TreeMap<>((a, b) -> b - a);
        int remaining = amount;

        for (int denom : new int[] { 2000, 500, 200, 100 }) {
            if (remaining == 0)
                break;
            Notes notes = NoteAvailable.get(denom);
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
            System.out.println("Amount Cannot be With Draw Because of insufficient balance : ");

            for (Map.Entry<Integer, Integer> entry : dispensed.entrySet()) {
                NoteAvailable.get(entry.getKey()).addNotes(entry.getValue() * entry.getKey());
            }
            return;
        }

        System.out.println("Notes Given:");
        for (Map.Entry<Integer, Integer> entry : dispensed.entrySet()) {
            System.out.println(entry.getValue() + " x " + entry.getKey());
        }
    }

    private int getTotalBalance() {
        int total = 0;
        for (Map.Entry<Integer, Notes> entry : NoteAvailable.entrySet()) {
            total += entry.getKey() * entry.getValue().getNotes();
        }
        return total;
    }

    public void printBalance() {
        System.out.println("Current Balance :");
        for (Map.Entry<Integer, Notes> entry : NoteAvailable.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().getNotes() + " notes");
        }
        System.out.println("Total Current Balance : " + getTotalBalance());
    }

    public void banTypeOfNote(int TypeOfNote) {
        if (NoteAvailable.containsKey(TypeOfNote)) {
            NoteAvailable.remove(TypeOfNote);
            System.out.println("TypeOfNote of Note " + TypeOfNote + " has been banned now.");
        } else {
            System.out.println("TypeOfNote of Note " + TypeOfNote + " not found.");
        }
    }

    public void addTypeOfNote(int TypeOfNote, Notes notes) {
        NoteAvailable.put(TypeOfNote, notes);
        System.out.println("TypeOfNote " + TypeOfNote + " has been added.");
    }
}
