import java.util.Scanner;
public class Temperature_conversion{
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the temperature : ");
        double temp = scan.nextDouble();
        System.out.print("1 - Celsius to Fahrenheit\n2 - Fahrenheit to Celsius \nChoose the option : ");
        int choice = scan.nextInt();
        if(choice==1){
            Celsius_to_fahrenheit c = new Celsius_to_fahrenheit();
            System.out.print(temp+" in Fahrenheit is : "+c.c_to_f(temp));
        }
        else if(choice==2){
            Fahrenheit_to_celsius c = new Fahrenheit_to_celsius();
            System.out.print(temp+" in Fahrenheit is : "+c.f_to_c(temp));
        }
        else{
            System.out.print("Invalid choice !");
        }
        scan.close();
    }
}
