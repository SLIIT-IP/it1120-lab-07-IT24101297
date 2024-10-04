import java.util.Scanner;

public class IT24101297Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop for 3 students
        for (int student = 1; student <= 3; student++) {

            System.out.println("Student " + student + ":");
            System.out.print("Enter marks: "); // Prompt to enter marks

            // Read input for 4 subjects in a single line
            int[] marks = new int[4];
            int sum = 0;
            for (int i = 0; i < 4; i++) {
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
            System.out.println("Average Marks: " + average);
            System.out.println("Grade: " + grade);
            System.out.println();
        }

        scanner.close();
    }
}
