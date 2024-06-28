// to a number be a power of two in its binary reprentaion there should be only 1 presnt 

import java.util.Scanner;

/**
 * Number_Is_Power_Of_2
 */
public class Number_Is_Power_Of_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int num=n;
        int count_1=0;
        while(n>0){
            int last=n&1;
            if(last==1){
                count_1++;
            }
            n=n>>1;
        }
        if(count_1==1){
            System.out.printf("%d is a power of 2 \n",num);

        }
        else{
            System.out.printf("%d is not the power of 2",num);
        }

        sc.close();
    }
}