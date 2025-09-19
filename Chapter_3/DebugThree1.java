import java.util.Scanner;

public class Debug {
    public static void main(String args[]) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);

        // Get the amount of the checks
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble(); // Use nextDouble instead of nextInt

        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble(); // Fixed typo: inputnextInt() to input.nextDouble()

        // Call calcTip() with both check amounts
        calcTip(check1); // Pass check1
        calcTip(check2); // Pass check2
    }

    public static void calcTip(double bill) { // Method should accept a bill amount
        final double RATE = 0.15; // Fixed typo "doubel" to "double"
        double tip = bill * RATE; // Corrected calculation: bill * RATE
        System.out.println("The tip should be at least $" + tip); // Print the result
    }
}
