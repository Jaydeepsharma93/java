import java.util.Scanner;

public class minfrom3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        short num1 ,num2,num3;

        System.out.print("enter the num1:");
        num1=input.nextShort();
        System.out.print("enter the num2:");
        num2=input.nextShort();
        System.out.print("enter the num3:");
        num3=input.nextShort();


        if(num1<num2) {
            if(num1<num3) {
                System.out.println("num1 is min");
            }
            else{
                System.out.println("num3 is min");
            }
        }
        else {
            if(num2<num3) {
                System.out.println("num2 is min");
            }
            else{
                System.out.println("num3 is min");
            }
        }

    }
}