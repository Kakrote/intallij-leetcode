import java.util.ArrayList;
import java.util.List;

public class Finding_All_disappers {
    public static void main(String[] args) {
        
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        int l=nums.length;
        while(i<l){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swapp(nums,i,correct);
            }
            else{
                i++;
            }
        }
        // find the missing numbers now
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<l;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    int[] swapp(int[] arr,int i,int correct){
        int temmp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temmp;
        return arr;
    }
}
