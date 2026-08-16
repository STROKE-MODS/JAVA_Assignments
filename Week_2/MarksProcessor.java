import java.util.Scanner;
public class MarksProcessor {
    void marks_scorer(){
        Scanner scan = new Scanner(System.in);
        int t=0;
        int sum = 0;
        int highest =0;
        int passses=0;
        int failures =0;
        int count = 0;
        while(t==0){
            System.out.print("Enter the marks : ");
            int marks = scan.nextInt();
            if(marks>0){
                count++;
                sum+=marks;
                if(marks>highest){
                    highest = marks;
                }
            if(marks>=50){
                passses++;
            }
            if(marks<50){
                failures++;
            }
            if(marks==-1){
                break;
            }
        }
        }
        System.out.println("Valid marks : "+count);
        System.out.println("Sum of marks : "+sum);
        System.out.println("Passing students : "+passses);
        System.out.println("Failing students : "+failures);
        System.out.println("Highest marks : "+highest);
        System.out.println("Averager marks : "+sum/(float)count);
        scan.close();
    }
}
