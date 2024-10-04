import java.util.Scanner;

public class IT24101297Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05; // 5% discount
        final int TOTAL_CUSTOMERS = 5;

        for (int i = 1; i <= TOTAL_CUSTOMERS; i++) {
            System.out.println("Customer " + i + ":");

            // Input total bill amount
            System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();

            // Input payment mode
            System.out.print("Enter payment mode (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

            // Check for valid payment mode and calculate final amount
            if (paymentMode == 'C' || paymentMode == 'c') {
                // Calculate discount for cash payment
                double discount = billAmount * DISCOUNT_RATE;
                double finalAmount = billAmount - discount;
                System.out.println("Discount: $" + discount);
                System.out.println("Amount to be paid: $" + finalAmount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {

                System.out.println("No discount applied.");
                System.out.println("Amount to be paid: $" + billAmount);
            } else {

                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        scanner.close();
    }
}
