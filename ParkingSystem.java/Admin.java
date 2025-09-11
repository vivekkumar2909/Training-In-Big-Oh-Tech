public class Admin extends User {

    private final boolean isAdmin;

    public Admin(int id, String name, boolean isAdmin) {
        super(id, name, isAdmin);
        this.isAdmin = isAdmin;
    }

    boolean isAdmin() {
        return this.isAdmin;
    }

}