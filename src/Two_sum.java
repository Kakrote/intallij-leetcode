public class Two_sum {
    public static void main(String[] args) {
        int []arr={3,2,4};
        int target=6;
        int a[]=twoSum(arr,target);
        System.out.println(a.toString());
    }
    public static int[] twoSum(int[] nums, int target) {
        int []ans={-1,-1};
        int []notans=ans;
        for(int i=0;i<nums.length;i++){
            for (int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return notans;
    }
}
