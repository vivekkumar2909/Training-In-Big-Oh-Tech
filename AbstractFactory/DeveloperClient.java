// package AbstractFactory;

// public class DeveloperClient {

//     public static void main(String[] args) {
//         Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloper());
//     }
// }

//Wrong Code in above i anm directly calling the androiddeveloper instead i have to call factory;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidFactory());
        System.out.println(e1.getName() + " | Salary: " + e1.getSalary());

        Employee e2 = EmployeeFactory.getEmployee(new AIMLFacory());
        System.out.println(e2.getName() + " | Salary: " + e2.getSalary());
    }
}
