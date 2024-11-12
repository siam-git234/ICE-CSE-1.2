import java.util.Scanner;
public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum: " + sum);
        scanner.close();
    }
}
