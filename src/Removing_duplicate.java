import java.util.Arrays;

public class Removing_duplicate {

    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int newSize = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(newSize);
    }
    public static int removeDuplicates(int[] nums) {
        int curr=0;
        int a=0;
        for(int i=1; i<nums.length; i++){
            if(nums[curr] != nums[i]){
                nums[a++] = nums[curr];
            }
            curr += 1;
        }
        nums[a] = nums[curr];

        return a+1;
    }
}
