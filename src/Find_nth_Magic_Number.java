public class Find_nth_Magic_Number {
    public static void main(String[] args) {
        int n=4; // the nth number in the series 
        int ans=0; // initialy the answer is 0
        int base=5;// the base is set to be the 5
        while(n>0){
            int last=n&1; // will give us the last digit of the n converting it into the binary
            n=n>>1; // using right shift operator to shift the bits to the right 
            ans+=base*last; 
            base=base*5; // updating the base 
            
        }
        System.out.println(ans);
    }
}
