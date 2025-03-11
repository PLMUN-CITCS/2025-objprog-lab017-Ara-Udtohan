import java.util.Scanner;

public class GradeCalculator {
    
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score;
        
        while (true) {
            try {
                System.out.print("Enter your score: ");
                score = Double.parseDouble(scanner.nextLine());
                
                if (score >= 0 && score <= 100) {
                    return score;
                } else {
                    System.out.println("Please enter a valid score between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numerical value.");
            }
        }
    }
    
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public static void main(String[] args) {
        double score = getStudentScore();
        String grade = calculateGrade(score);
        System.out.println("Your grade is: " + grade);
    }
}