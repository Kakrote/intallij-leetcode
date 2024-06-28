import java.util.Scanner;

/**
 * Find_The_Number_of_Digits_In_Binary
 */
public class Find_The_Number_of_Digits_In_Binary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            n=n>>1;// right shift the digits to the right until it encounters the 0
            count++;// increment count on every phase.
        }
        System.out.println(count);

        sc.close();
    }
}