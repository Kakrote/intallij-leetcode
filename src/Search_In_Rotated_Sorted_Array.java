public class Search_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int arr[]={5,1,3};
        int ans=search(arr, 5);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        int pivot=find_Pivot(nums) ;
        System.out.println(pivot);
        // if pivot not find then array is not rotated
        if(pivot==-1){
            // perform binary search;
            return binaryserarch(nums, target, 0, nums.length-1);
        }
        // if pivot is found then have 2 sorted accending arrays
        // case 1 for answers
        if(nums[pivot]==target){
            return pivot;
        }
        // case 2 the target is greater then the starting element

        if(nums[start]<=target){
            return binaryserarch(nums, target, start, pivot-1);
        }
        // case 3 the target is smaller the starting element
        return binaryserarch(nums, target,pivot+1, end);
    }
    // this wont work with duplicate values.
    static int find_Pivot(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // 4 casses 
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end=mid-1;

            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }
    static int binaryserarch(int []arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
