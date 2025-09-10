// package AbstractFactory;

public class AIMLDeveloper implements Employee {
    @Override
    public String getName() {
        System.out.println("I am AiMl Developer");
        return "Vikash";
    }

    @Override
    public int getSalary() {

        return 75000;
    }
}
