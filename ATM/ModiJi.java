public class ModiJi {
    private ATM atm;

    public ModiJi(ATM atm) {
        this.atm = atm;
    }

    public void demonetizeNote(int denomination) {
        atm.banTypeOfNote(denomination);
    }

    public void introduceNewNote(int denomination, Notes notes) {
        atm.addTypeOfNote(denomination, notes);
    }
}
