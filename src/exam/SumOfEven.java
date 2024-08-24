import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N : ");

        int n = scanner.nextInt();
        int sum = sumOfEven(n);

        System.out.println("The sum of even numbers 1 to " + n + " is: " + sum);
        scanner.close();
    }

    public static int sumOfEven(int n) {

        if (n <= 1) {
            return 0;
        } else if (n % 2 == 0) {
            return n + sumOfEven(n - 2);
        } else {
            return sumOfEven(n - 1);
        }

    }
}
