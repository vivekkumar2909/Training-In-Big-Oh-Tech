// package AbstractFactory;

public class AndroidFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        // TODO Auto-generated method stub
        return new AndroidDeveloper();
    }

}
