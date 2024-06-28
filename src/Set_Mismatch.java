// in this we will find the number which is missing and the number which is repeating it self twice in the array.
// we will simply use the cyclic sort method and will find the requird answer

/**
 * Set_Mismatch
 */
public class Set_Mismatch {

    public static void main(String[] args) {
        
    }
    public int[] findErrorNums(int[] nums) {
        int l=nums.length;
        int i=0;
        // lets create an empty array to hold the answer 
        int []ans=new int[2];
        while(i<l){
            int currect=nums[i]-1;
            // now just perform the cyclic sort.
            if(nums[i]!=nums[currect]){
                swapp(nums,i,currect);
            }
            else{
                i++;
            }
            
        }
        // now when we have the cyclic sort performed and have the sorted array in the required order we just have to find the requuires answers
        for(int index=0;index<l;index++){
            if(nums[index]!=index+1){
                ans[0]=nums[index]; // this is the repeated value
                ans[1]=index+1; // this will be the missing value 
            }
        }
        return ans;
    }
    static int[] swapp(int[] arr,int i,int correct){
        int temmp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temmp;
        return arr;
    }
}