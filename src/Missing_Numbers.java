public class Missing_Numbers {
    public static void main(String[] args) {
        
    }
    public int missingNumber(int[] nums) {
        // note in this we can see that the value should be at it the index=value as the values in the array start from 0 to n;
        // if the number is not that the index then that number is the our answer. 

        // int num=0;
        int l=nums.length;
        int i=0;
        while(i<l){
            int correct=nums[i];
            if(nums[i]<l && nums[i]!=nums[correct]){
                swapp(nums, i,correct);
            }
            else{
                i++;
            }
        }
        // searching for the missing number
        for(int index=0;index<l;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        // case 2
        return l;
    }
    static int[] swapp(int []arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
        return arr;
    }
}
