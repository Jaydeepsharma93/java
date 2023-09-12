import java.util.Scanner;

public class Min {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        short num1 ,num2;

        System.out.print("enter the num1:");
        num1=input.nextShort();
        System.out.print("enter the num2:");
        num2=input.nextShort();

        if(num1<num2)
        {
            System.out.println("num1 is min");
        }
        else
        {
            System.out.println("num2 is min");
        }

    }
}