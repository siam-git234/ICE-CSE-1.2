import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner instance
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        int days;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> days = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
            default -> {
                System.out.println("Invalid month.");
                scanner.close(); // Close scanner here if input is invalid
                return;
            }
        }
        
        System.out.println("Days in month: " + days);
        scanner.close(); // Close scanner to prevent resource leak
    }
}
