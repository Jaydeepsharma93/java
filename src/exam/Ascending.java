import java.util.Arrays;
import java.util.Scanner;

public class Ascending{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(arr);
        System.out.print("array in ascending order is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}