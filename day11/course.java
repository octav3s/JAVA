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
