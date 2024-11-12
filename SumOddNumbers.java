import java.util.Scanner;
public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1, count = 0; count < n; i += 2, count++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " odd numbers: " + sum);
        scanner.close();
    }
}
