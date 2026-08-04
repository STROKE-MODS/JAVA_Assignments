package Week_2;
import java.util.Scanner;
class Specfymark{
    String classifyMark(int t){
if(t>80 && t<100){
        return "Distinction category";
    }
    else if(t>70 && t<79){
        return "Merit Category";
    }
    else if(t>50 && t<69){
        return "Pass category";
    }
    else{
        return "Fail category";
    }
    
    }
}
public class GradingSystem {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Specfymark st = new Specfymark();
        System.out.print("Enter your marks : ");
        int t= scan.nextInt();
    if(t<0){
        System.out.println("The marks should be under 100 and not negative");
    }
    else if(t>100){
        System.out.println("The marks should be under 100 and not negative");
    }
    else{
        System.out.println("You are in "+st.classifyMark(t));
    }
    scan.close();
}
}
