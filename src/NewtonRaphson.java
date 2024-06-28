import java.util.Scanner;

public class NewtonRaphson {
    public static void main(String[] args) {
        System.out.println("Enter the number:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=sqt(n);// n is the number and the p is the precition in the root 
        System.out.printf("%.3f",a);
    }
    public static double sqt(double n){
        double x=n;
        double root;
        while(true){
            root=0.5*(x+(n/x)); // this is the formula for the newton raphson method to find the root with minimum error 
            if(Math.abs(root-x)<1){ // here we are taking the error is less then 1 for more accuracy we can reduce its value like 0.5 etc
                break;
                //note Math.abs method is use to get the absoulute value of the number non negative number.
            }
            x=root;
        }
        return root;


    }
}
