import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        Admin admin = new Admin(atm);
        User user = new User(atm);

        System.out.println("Top-up Of the ATM ");
        admin.topUp(2000, 40000);
        admin.topUp(500, 20000);
        admin.topUp(200, 1000000);
        admin.topUp(100, 10000);

        admin.printBalance();

        user.setCurrentBalance(100000);

        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("Enter The choice for the ATM Service...");
            System.out.println("1. Withdraw Your Money");
            System.out.println("2. Deposit the Money");
            System.out.println("3. Get Your Current Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to Withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    atm.withdraw(withdrawAmount);
                    flag = false;
                    break;

                case 2:
                    System.out.print("Enter Note Type : ");
                    int note = sc.nextInt();

                    System.out.print("Enter number of Amount to deposit : ");
                    int amount = sc.nextInt();

                    atm.topUp(note, amount);

                    user.setCurrentBalance(amount);

                    System.out.println("Your amount Deposit SuccessFully ");

                    flag = false;
                    break;

                case 3:
                    user.getCurrentBalance();
                    // user.printBalance();

                    flag = false;
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    return;

                default:
                    System.out.println("You don't have any choice Try again.");
            }
        }

        admin.printBalance();
    }
}
