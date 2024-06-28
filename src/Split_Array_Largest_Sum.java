public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        
    }
    public int splitArray(int[] nums, int k) {
       int start=0;
       int end=0;
       for(int i=0;i<nums.length;i++){
        start=Math.max(start, nums[i]); // in the end of the loop it would have the maximum value of the array.start cantains the lower bound 
        end+=nums[i]; // this contain the upper bound.
       }
       while (start<end) {
        // try for the middle as potential ans
        int mid=start+(end-start)/2;
        // calculate the peaces we can divide this in the with this max sum.
        int sum=0;
        int peaces=1; // This checks the no of sub-arrays created every time
        for(int num:nums){
            if(sum+num>mid){
                // you cant add this to the subarray make a new array
                // say you add this num in new subarray, then sum=num
                sum=num;
                peaces++;
            }
            else{
                sum+=num;
            }

        }
        if(peaces>k){ // this condition is for to check the no of sub-arrays do not exceed the value of k
            start=mid+1;

        }
        else{
            end=mid;
        }
       }

        
        return end; // we could have return the mid value of the array as both end and mid are in same postion.
    }
}
