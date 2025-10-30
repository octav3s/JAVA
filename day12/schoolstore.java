package day12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class schoolstore {
    public static void main(String[] args) {
        File file = new File("assignment.txt");
        char array[] = new char[150];

        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created successfully" + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter("log.txt");
            writer.write("Book order placed at 10am");
            writer.close();

            FileReader reader = new FileReader("log.txt");
            reader.read(array);

            System.out.println("Java File Handling Practice");
            System.out.println(array);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean deleted = file.delete();
        if (deleted) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}