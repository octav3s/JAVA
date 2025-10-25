public class scorechecker {
public static void main(String[] args) {

        int[] scores = {95, 82, 67, 48, 73};

        for (int score : scores) {
            if (score >= 90) {
                System.out.println("Excellent");
            } 
            else if (score >= 75) {
                System.out.println("Good");
            }
             else if (score >= 50) {
                System.out.println("Average");
            }
             else {
                System.out.println("Fail");
            }
        }
    }
}