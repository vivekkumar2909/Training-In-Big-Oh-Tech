public class Driver extends Person {
    Driver(String name, String Constituency) {
        super(name, Constituency, false);
    }

    public void GetDetailsOFDriver(String str) {
        System.out.println("Driver is " + this.getName() + " " + str);
    }
}
