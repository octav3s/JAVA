package MachineTest;
import java.util.Scanner;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class studentSearch {
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);

        Student[] students = 
        {
            new Student(1, "rajesh"),
            new Student(2, "rahul"),
            new Student(3, "sruthi"),
        };

        System.out.print("Enter student ID: ");
        int Id = S.nextInt();

        boolean found = false;
        for (Student student : students) 
        {
            if (student.id == Id) {
                System.out.println("Student Found: ID = " + student.id + ", Name = " + student.name);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + Id + " not found.");
        }

        S.close();
    }
}
