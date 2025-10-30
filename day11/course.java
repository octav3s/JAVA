package day11;
public class course {
    private String courseName;
    private int durationWeeks;
    private int studentsEnrolled;
    private static final String CREATOR = "CodeMentor Academy";
    private static int totalStudents = 0;

    public course(String courseName, int durationWeeks, int studentsEnrolled) {
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
        this.studentsEnrolled = studentsEnrolled;
        totalStudents += studentsEnrolled;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDurationWeeks() {
        return durationWeeks;
    }

    public int getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public static String getCreator() {
        return CREATOR;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static class Platform {
        public static void displayPlatformMessage() {
            System.out.println("Courses are hosted on CodeMentor.");
        }
    }
}

class courseTest {
    public static void main(String[] args) {
        course course1 = new course("Java Programming", 8, 120);
        course course2 = new course("Web Development", 10, 150);

        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Duration (weeks): " + course1.getDurationWeeks());
        System.out.println("Students Enrolled: " + course1.getStudentsEnrolled());
        System.out.println("Creator: " + course.getCreator());
        System.out.println();

        System.out.println("Course Name: " + course2.getCourseName());
        System.out.println("Duration (weeks): " + course2.getDurationWeeks());
        System.out.println("Students Enrolled: " + course2.getStudentsEnrolled());
        System.out.println("Creator: " + course.getCreator());
        System.out.println();

        System.out.println("Total Students Enrolled Across All Courses: " + course.getTotalStudents());
        System.out.println();

        course.Platform.displayPlatformMessage();
    }
}
