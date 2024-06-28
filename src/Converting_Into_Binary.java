import java.util.Scanner;

public class Converting_Into_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int num=n;
        int size=0;
        while(n>0){
            n=n>>1;
            size++;
        }
        int last[]=new int[size];
        int i=0;
        while (num>0) {
            int ls=num&1;
            int digit=ls;
            last[i]=digit;
            num=num>>1;
            i++;
        }
        int len=last.length;
        for(int j=len-1;j>=0;j--){
            System.out.print(last[j]);

        }
        sc.close();
    }
}
