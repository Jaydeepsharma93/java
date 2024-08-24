import java.util.Scanner;

public class Maxarr{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter "+ i +" : ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int l = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }
        }
        System.out.println("The largest element in the array is : " + l);
    }
}