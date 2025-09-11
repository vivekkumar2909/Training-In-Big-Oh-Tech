
public class Notes200 implements Notes {
    private int notesCount;

    public Notes200() {
        this.notesCount = 0;
    }

    @Override
    public void addNotes(int amount) {
        if (amount % 200 != 0) {
            System.out.println("Only You Can add the 200  money notes");
            return;
        }
        int addedNotes = amount / 200;
        notesCount += addedNotes;
        System.out.println(addedNotes + " notes of 200 added. Total: " + notesCount);
    }

    @Override
    public void removeNotes(int count) {
        if (count > notesCount) {
            System.out.println("Not enough notes to remove");
            return;
        }
        notesCount -= count;
        System.out.println(count + " notes of 200 removed. Total : " + notesCount);
    }

    @Override
    public int getNotes() {
        return notesCount;
    }
}
