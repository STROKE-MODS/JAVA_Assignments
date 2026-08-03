package Simple_interest.Simple_interest;
import java.util.Scanner;
public class Main {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        Forumlas form = new Forumlas();

        System.out.print("What do you want to find : \n1.Simple Interest\n2.Final Amount \n Choose: ");
        int choice =  scan.nextInt();
        if(choice==1){

            System.out.print("Enter the principle amount : ");
            double principle = scan.nextDouble();
            System.out.print("Enter the rate : ");
            double rate = scan.nextDouble();
            System.out.print("Enter the time : ");
            double time = scan.nextDouble();
            System.out.println("The simple interest is : "+form.simle(principle, rate, time));
        }
        else if(choice ==2){
            System.out.print("Enter the Simple intereset : ");
            double t = scan.nextDouble();
            System.out.print("Enter the Time : ");
            double s = scan.nextDouble();
            System.out.println("The Final amount is : "+form.finalamount(t, s));
        }
        scan.close();
        
        
    }
}
