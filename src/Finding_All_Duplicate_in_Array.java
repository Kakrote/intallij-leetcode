import java.util.ArrayList;
import java.util.List;

/**
 * Finding_All_Duplicate_in_Array
 */
public class Finding_All_Duplicate_in_Array {

    public static void main(String[] args) {
        
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int l=nums.length;
        int i=0;
        while (i<l) {
            // lets perfom the cyclic sort first 
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swapp(nums,i,correct);
            }
            else{
                i++;
            }
        }
        // now when we have our array in sorted order according to the cyclic algo.
        // all we need to find the duplicate values
        for(int index=0;index<l;index++){
            if(nums[index]!=index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    int [] swapp(int arr[],int i,int correct){
        int temmp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temmp;
        return arr;
    }
}