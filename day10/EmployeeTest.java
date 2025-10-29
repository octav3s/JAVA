package day10;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        Employee E2 = new Employee();

        E1.setName("Jacob Smith");
        E1.setID_number(101);
        E1.setDepartment("HR");
        E1.setSalary(50000.00);

        E2.setName("John Doe");
        E2.setID_number(102);
        E2.setDepartment("Finance");
        E2.setSalary(70000.00);

        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + E1.getName());
        System.out.println("ID Number: " + E1.getID_number());
        System.out.println("Department: " + E1.getDepartment());
        System.out.println("Salary: Rs." + E1.getSalary());

        System.out.println("\nEmployee 2 Details:");
        System.out.println("Name: " + E2.getName());
        System.out.println("ID Number: " + E2.getID_number());
        System.out.println("Department: " + E2.getDepartment());
        System.out.println("Salary: Rs." + E2.getSalary());
    }
}