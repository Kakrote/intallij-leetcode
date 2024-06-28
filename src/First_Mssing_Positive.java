public class First_Mssing_Positive {
    public static void main(String[] args) {
        
    }
    public int firstMissingPositive(int[] nums) {
        int l=nums.length;
        int i=0;
        // applying cyclic sort to get the desired arrangement 
        while(i<l){
            int currect=nums[i]-1;
            if(nums[i]>0 && nums[i]<=l &&nums[i]!=nums[currect]){
                swapp(nums,i,currect);
            }
            else{
                i++;
            }
        }
        // now when we have our desired arrangement we can start finding the answer in the sorted array
        for(int index=0;index<l;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        return l+1;
    }
    public int[] swapp(int []arr,int i,int currect){
        int temp=arr[i];
        arr[i]=arr[currect];
        arr[currect]=temp;
        return arr;
    }
}
