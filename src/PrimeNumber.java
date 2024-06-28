import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n=sc.nextInt();
        boolean [] primes=new boolean[n+1];
        // System.out.println(primes[0]);
        sieve(n, primes);
        sc.close();
    }
    // by defult the value in the primes is the flase
    static void sieve(int n,boolean[] primes){

        for(int i=2;i*i<=n;i++){

            if(primes[i]==false){
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(primes[i]==false){
                System.out.print(i+" ");
            }
        }

    }
}
