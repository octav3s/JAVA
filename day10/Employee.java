package day10;

public class Employee {
    private String Name;
    private int ID_number;
    private String Department;
    private double Salary;

    public Employee() {

    }

public void employeeInfo(String Name, int ID_number, String Department, double Salary) {
        this.Name = Name;
        this.ID_number = ID_number;
        this.Department = Department;
        this.Salary = Salary;
}

public String getName() {
        return Name;
}

public void setName(String Name) {
        this.Name = Name;
}

public int getID_number() {
        return ID_number;
}

public void setID_number(int ID_number) {
        this.ID_number = ID_number;
}

public String getDepartment() {
        return Department;
}

public void setDepartment(String Department) {
        this.Department = Department;
}

public void setSalary(double Salary) {
        this.Salary = Salary;
}

public double getSalary() {
        return Salary;
}
}


