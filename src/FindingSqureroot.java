import java.util.Scanner;

public class FindingSqureroot {
    public static void main(String[] args) {
        System.out.println("Enter the number:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=root(n,3);// n is the number and the p is the precition in the root 
        System.out.printf("%.3f",a);
    }
    public static double root(int n,int p){
        int start=0;
        int end=n;
        double r=0.0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                r=mid;
                return r;
            }
            if(mid*mid<=n){
                start=mid+1;
            }
            end=mid-1;
        }
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(r*r<n){
                r+=incr;
            }
            r-=incr;
            incr/=10;
        }
        return r;
    }
}
