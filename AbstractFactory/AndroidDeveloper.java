// package AbstractFactory;

public class AndroidDeveloper implements Employee {
    @Override
    public int getSalary() {
        // TODO Auto-generated method stub
        return 60000;
    }

    @Override
    public String getName() {
        System.out.println("I am Android Developer");
        return "Vivek Kumar";
    }
}
