public class Person {

    private String name;
    private String Constituency;

    public boolean isPolitician = false;;

    Person(String name, String Constituency, boolean isPolitician) {
        this.name = name;
        this.Constituency = Constituency;
        this.isPolitician = isPolitician;
    }

    public String getName() {
        return this.name;
    }

    public String getConstituency() {
        return this.Constituency;
    }

    public boolean getIsPolitician() {
        return this.isPolitician;

    }

}
