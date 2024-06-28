import java.util.Arrays;

/**
 * Finding_repeated_elements_using_cyclic_sort
 */
public class Finding_repeated_elements_using_cyclic_sort {

    public static void main(String[] args) {
        Finding_repeated_elements_using_cyclic_sort obj=new Finding_repeated_elements_using_cyclic_sort();
        int arr[]={3,3,3,3,3};
        System.out.println((findDuplicate(arr)));
    }
    static public int  findDuplicate(int[] nums) {
        // note there is only one repeated number in the array in the given range
        // the range is given to us there for we can apply the cyclic sort here in this case
        int l=nums.length;
        int i=0;
        while(i<l){

            int correct=nums[i]-1;
            if(nums[i]==correct+1){
                return nums[i];
                
            }
            if (nums[i]!=nums[correct]) {
                swapp(nums,i,correct);
            }
            else{
                i++;
            }

        }
        // now the array is sorted according to the cyclic sorted alog.
        // we have to find the repeated element;

        return nums[l-1];   
    }
    static int []swapp(int arr[],int i,int correct){
        int temmp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temmp;
        return arr;
    }
}