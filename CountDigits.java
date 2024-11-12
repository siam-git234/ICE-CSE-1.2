import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        if (number >= 0 && number < 10000000000L) {
            int digits = String.valueOf(number).length();
            System.out.println("Number of digits: " + digits);
        } else {
            System.out.println("Number exceeds ten billion or is negative.");
        }
        scanner.close();
    }
}
