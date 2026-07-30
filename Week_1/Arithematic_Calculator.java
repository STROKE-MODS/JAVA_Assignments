
import java.util.Scanner;
public class Arithematic_Calculator {
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double t = scan.nextDouble();
        System.out.print("Enter the second number :");
        double b  = scan.nextDouble();
        System.out.println("Enter which operation you want to perform : \n1.Addtion\n2.Subtraction\n3.Multiplication\n4.Divison\n5.Remainder");
        int k = scan.nextInt();
        if(k==1){
            Sum s = new Sum();
            System.out.println("The sum is : "+s.addition(t,b));
        }
        else if(k==2){
            Difference dif = new Difference();
            System.out.println("The difference is : "+dif.diff(t, b));
        }
        else if(k==3){
            Product pr = new Product();
            System.out.println("The product is : "+pr.mult(t, b));
        }
        else if(k==4){
            Divison dib = new Divison();
            System.out.println("The Divison is : "+dib.remainder(t, b));
        }
        else if(k==5){
            Remainder rem = new Remainder();
            System.out.println("The Remainder is : "+rem.remain(t, b));
        }
        else{
            System.out.println("Invalid input");
        }
        scan.close();
    }

}
