import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double totalGradePointsEarned = 0;
        int totalCreditHours = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Enter the details for Course " + i + ":");
            System.out.print("Enter grade (A, A-, B+, etc.): ");
            String grade = scanner.next();
            System.out.print("Enter credit hours: ");
            int creditHours = scanner.nextInt();

            double gradePoint = getGradePoint(grade);
            double gradePointsEarned = gradePoint * creditHours;

            totalGradePointsEarned += gradePointsEarned;
            totalCreditHours += creditHours;
        }

        double cgpa = totalGradePointsEarned / totalCreditHours;
        System.out.println("Your CGPA is: " + cgpa);

        scanner.close();
    }

    private static double getGradePoint(String grade) {
        switch (grade) {
            case "A":
                return 4.0;
            case "A-":
                return 3.7;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            // Add more cases for other grades as needed
            default:
                System.out.println("Invalid grade entered: " + grade);
                return 0.0;
        }
    }
}
