import java.util.Scanner;

public class neutral {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        short num1;

        System.out.print("enter the num:");
        num1=input.nextShort();

        if(num1<0)
        {
            System.out.println("is negative");
        }
        else if(num1>0)
        {
            System.out.println("is positive");
        }
        else {
            System.out.println("is neutral");
        }

    }
}