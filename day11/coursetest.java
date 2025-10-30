package day11;
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
