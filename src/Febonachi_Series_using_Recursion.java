public class Febonachi_Series_using_Recursion {
    public static void main(String[] args) {
        System.out.println(febo(3));
    }
//  the function will give the number at the index which will be pass in the function for febonachi series
    static int febo(int n){
        if(n<2){
            return n;
        }
        return febo(n-1)+febo(n-2);
    }
}
//  the problem is that this will get stuck in the larger values such as 50 if we want to have the 50th febonachi number this will stuck at.
// the multiple recursion calls.
// to avoid this issu we could use akrabachi formula.
