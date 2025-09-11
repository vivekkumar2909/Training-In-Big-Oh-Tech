
public class Notes100 implements Notes {
    private int notesCount;

    public Notes100() {
        this.notesCount = 0;
    }

    @Override
    public void addNotes(int amount) {
        if (amount % 100 != 0) {
            System.out.println("Only You Can add the 100 money notes");
            return;
        }
        int addedNotes = amount / 100;
        notesCount += addedNotes;
        System.out.println(addedNotes + " notes of 100 added. Total : " + notesCount);
    }

    @Override
    public void removeNotes(int count) {
        if (count > notesCount) {
            System.out.println("Not enough notes to remove");
            return;
        }
        notesCount -= count;
        System.out.println(count + " notes of 100 removed. Total : " + notesCount);
    }

    @Override
    public int getNotes() {
        return notesCount;
    }
}
