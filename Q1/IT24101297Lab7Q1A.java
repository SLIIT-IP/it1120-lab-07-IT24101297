import java.util.Scanner;

public class IT24101297Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[4];
        int sum = 0;

        // Input marks
        System.out.println("Enter marks for 4 subjects:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i]; // Add the marks to sum
        }

        // Calculate average
        double average = sum / 4.0;

        // Determine grade
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else if (average >= 0 && average < 50) {
            grade = "Fail";
        } else {
            grade = "Invalid marks entered!";
        }

        // Output average and grade
        System.out.println("Average is: " + average);
        System.out.println("Overall Grade is: " + grade);

        scanner.close();
    }
}
