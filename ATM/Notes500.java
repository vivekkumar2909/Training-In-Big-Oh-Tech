public class Notes500 implements Notes {

    private int notesCount;

    public Notes500() {
        this.notesCount = 0;
    }

    @Override
    public void addNotes(int amount) {
        if (amount % 500 != 0) {
            System.out.println("Only You Can add the 500 money notes");
            return;
        }
        int addedNotes = amount / 500;
        notesCount += addedNotes;
        System.out.println(addedNotes + " notes of 500 added. Total: " + notesCount);
    }

    @Override
    public void removeNotes(int count) {
        if (count > notesCount) {
            System.out.println("Not enough notes to remove");
            return;
        }
        notesCount -= count;
        System.out.println(count + " notes of 500 removed. Total : " + notesCount);
    }

    @Override
    public int getNotes() {
        return notesCount;
    }
}
