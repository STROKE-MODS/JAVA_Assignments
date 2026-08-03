package Arithematic_Calculator;
public class Divison {
    double remainder(double a,double b){
        if(b==0){
            System.err.println("0 Divison is not allowed.");
        }
        else{
            double d = a/b;
            return d;
        }
        return 0;
    }
}
