public class Palendrome_Number {
    public static void main(String[] args) {
        
    }
    public boolean isPalindrome(int x) {
        int num=x;
        int palendrome=0;
        boolean isPal=true;
        if(x<0){
            return false;
        }
        while(x!=0){
            palendrome=10*palendrome+x%10;
            x=x/10;
        }
        if(palendrome==num){
            return isPal;
        }
        return false;
    }
}
