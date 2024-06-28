import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        ReversingNumber rv=new ReversingNumber();
        int a=rv.rev1(234);
        System.out.println(a);
    }
    // this is the normal method 
    public int  reverse(int n){

        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }

        return rev;
    }
    // now using recusion
    public int rev1(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    public int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
       int  rem=n%10;
        return rem*(int)Math.pow(10, digits-1)+helper(n/10, digits-1);
    }
}
