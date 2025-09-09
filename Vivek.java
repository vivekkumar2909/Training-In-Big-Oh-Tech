
class Vivek {
    public static void main(String[] args) {
        MP mp1 = new MP("Vivek Gupta", "Delhi", "Naresh", 100000, true);
        Minister minister1 = new Minister("Vishal Kumar", "Jharkhand", "Abhay", 1000000, true);
        PM pm = new PM("Narendra Modi", "Varanasi", "Prabhat", "Himmat Singh", 10000000, true);

        Person person = new Person("Shalu", "Daltonganj", false);

        System.out.println(person.getIsPolitician());
        System.out.println(pm.getIsPolitician());

        // PM.getIsPolitician();

        // if expense within 1 lakh
        mp1.addExpense(10000);
        mp1.addExpense(150000);

        // if expense within 10 lakh
        minister1.addExpense(1600000);
        minister1.addExpense(1900000);

        // if expenses within the 1 crore
        pm.addExpense(5000000);

        Commissioner commissioner = new Commissioner("Vivek Kumar");

        commissioner.canArrest(mp1, pm);
        commissioner.canArrest(minister1, pm);
        commissioner.canArrest(pm, pm);

    }
}