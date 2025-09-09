public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployeeSalary("Android Developer");
         // ✅ Now it's valid
        System.out.println(employee.getSalary());
        Employee employee1 = EmployeeFactory.getEmployeeSalary("Web Developer");
         // ✅ Now it's valid
        System.out.println(employee1.getSalary());
    }
}
