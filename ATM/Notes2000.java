public class Notes2000 implements Notes {
    private int notesCount;

    public Notes2000() {
        this.notesCount = 0;
    }

    @Override
    public void addNotes(int amount) {
        if (amount % 2000 != 0) {
            System.out.println("Only You Can add the 2000 money notes");
            return;
        }
        int addedNotes = amount / 2000;
        notesCount += addedNotes;
        System.out.println(addedNotes + " notes of 2000 added. Total : " + notesCount);
    }

    @Override
    public void removeNotes(int count) {
        if (count > notesCount) {
            System.out.println("Not enough notes to remove");
            return;
        }
        notesCount -= count;
        System.out.println(count + " notes of 2000 removed. Total: " + notesCount);
    }

    @Override
    public int getNotes() {
        return notesCount;
    }
}
