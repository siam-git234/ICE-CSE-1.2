import java.util.Scanner;
public class FloatChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        float number = scanner.nextFloat();
        if (number == 0) {
            System.out.println("zero");
        } else {
            if (number > 0) {
                System.out.print("positive ");
            } else {
                System.out.print("negative ");
            }
            if (Math.abs(number) < 1) {
                System.out.println("small");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("large");
            } else {
                System.out.println();
            }
            scanner.close();
        }
    }
}
