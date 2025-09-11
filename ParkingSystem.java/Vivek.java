public class Vivek {
    public static void main(String[] args) throws InterruptedException {

        Admin admin = new Admin(1, "Vivek(Admin)", true);
        NormalUser user1 = new NormalUser(2, "Rohit");
        NormalUser user2 = new NormalUser(3, "Amit");

        Management management = new Management();

        management.handleUser(admin);
        management.handleUser(user1);
        management.handleUser(user2);
    }
}
