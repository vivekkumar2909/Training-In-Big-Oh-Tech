public class User {
    private int id;
    private String name;
    private boolean isAdmin;

    public User(int id, String name, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

}
