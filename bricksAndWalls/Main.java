
import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            Scanner sc = new Scanner(System.in);

            Manager manager = new Manager();

            System.out.println("Enter the user Name : ");

            String name = sc.nextLine();

            System.out.println("Enter the Owner Name : ");

            String OwnerName = sc.nextLine();

            User user = new User(name, 0);

            Admin admin = new Admin(OwnerName, 1);

            manager.setAdmin(user, admin);

            manager.addUser(user);

            System.out.println("Enter the Country Name : ");
            String CountryName = sc.nextLine();
            Country country = new Country(CountryName);

            // country.setName(CountryName);
            manager.addCountry(country);

            System.out.println("Enter the City Name : ");
            String CityName = sc.nextLine();

            City city = new City(CityName);

            // city.setName(CityName);

            manager.addCity(city);

            Walls wall = new Walls(0);

            manager.SetWall(wall);

            System.out.println("Take input that user will dedicate to whom : ");
            String dedicatedUser = sc.nextLine();

            System.out.println("Enter the caption, to paint : ");
            String caption = sc.nextLine();

            User dedicate = new User(dedicatedUser, 1);

            Bricks brick = new Bricks("0", caption, user, dedicate);
            manager.addBrick(CityName, brick);

            manager.editBrick("0", "Hello baby ", admin);

            User hot = manager.getHottestUser();

            System.out.println(hot.getName());

            System.out.println("Do you Want continue : ");
            flag = sc.nextBoolean();

            sc.close();

            // manager.getUsers();
        }

    }
}
