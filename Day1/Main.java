// Main.java
public class Main {
    public static void main(String[] args) {
        PCU pcu = new PCU(10, 230);
        GTI gti = new GTI(12, 230);
        // Regalia regalia = new Regalia(15, 230,false,false);
        // Regalia regalia1 = new Regalia(15, 230,true,true);
        // Regalia regalia1 = new Regalia(15, 230,true,true);
        Regalia regalia2 = new Regalia(15, 230,false,true);
        // Regalia regalia3 = new Regalia(15, 230,true,false);
        HomeInverter Icruze = new HomeInverter("iCruze", 8, 230);
        HomeInverter zelio = new HomeInverter("Zelio", 10, 240);

        System.out.println("=== Solar Inverters ===");
        pcu.displayDetails();
        pcu.chargeBattery();
        pcu.sellToGrid();

        System.out.println();

        gti.displayDetails();
        gti.chargeBattery();
        gti.sellToGrid();

        System.out.println();

        // regalia.displayDetails();
        // regalia.chargeBattery();
        // regalia.sellToGrid();

        System.out.println();

        // regalia1.displayDetails();
        // regalia1.chargeBattery();
        // regalia1.sellToGrid();


        System.out.println();

        regalia2.displayDetails();
        regalia2.chargeBattery();
        regalia2.sellToGrid();


        System.out.println();

        // regalia3.displayDetails();
        // regalia3.chargeBattery();
        // regalia3.sellToGrid();

        System.out.println("\n=== Non-Solar Inverter ===");
        Icruze.displayDetails();
        Icruze.chargeBattery();


        System.out.println("\n=== Non-Solar Inverter ===");
        zelio.displayDetails();
        zelio.chargeBattery();
    }
}
