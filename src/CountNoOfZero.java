public class CountNoOfZero {
    public static void main(String[] args) {
        System.out.println(count_0(300400, 0));
    }
    public static int count_0(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count+=1;
            // return count_0(n/10, count);
        }
        return count_0(n/10, count);
    }
}
