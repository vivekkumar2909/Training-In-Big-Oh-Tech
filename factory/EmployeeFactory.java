public class EmployeeFactory {
    public static Employee getEmployeeSalary(String str)
    {
        if (str.trim().equalsIgnoreCase("Android Developer"))
        {
            return new AndroidDeveloper();
        }
        else if (str.trim().equalsIgnoreCase("Web Developer"))
        {
            return new WebDeveloper();
        }
        return null;
    }
}
