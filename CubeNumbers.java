import java.util.Scanner;
public class CubeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Number: " + i + " Cube: " + (i * i * i));
        }
        scanner.close();
    }
}
