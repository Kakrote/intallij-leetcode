public class CountNumberOfSteps {
    public static void main(String[] args) {
        
    }
    public int numberOfSteps(int num) {
        int count =0;
        return helper(num,count);   
    }
    public int helper(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            return helper(num/2,count+1);
        }
        return helper(num-1,count+1);
    }
}
