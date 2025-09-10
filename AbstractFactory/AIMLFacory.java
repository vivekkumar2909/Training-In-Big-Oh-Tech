// package AbstractFactory;

public class AIMLFacory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {

        return new AIMLDeveloper();
    }
}
