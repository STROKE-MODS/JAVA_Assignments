// Digit extraction
package Digit_extraction;
import java.util.Scanner;
public class Final {
    public static void main(String a[]){

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the  3 digit number : ");
    int num = scan.nextInt();
    System.out.println("Ones : "+num%10);
    num = num/10;
    System.out.println("Tens : "+num%10);
    num = num/10;
    System.out.println("Hundreeds : "+num%10);
    scan.close();
}
    
}
