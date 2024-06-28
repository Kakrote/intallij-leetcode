public class Infinite_length_Array {
    public static void main(String[] args) {
        
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 
            100, 130, 140, 160, 170};
        int target=10;
        System.out.println(ans(arr, target));
    }
    static int ans(int []arr,int target){
        // first find the range. 
        // start with the range of 2.
        int start=0;
        int end=1;
        // condition for the target to fall in the range.
        // to do it we dont need to check the condition for the start we only need to check condition for the end only.
        while(target>arr[end]){
            int newstart=end+1;
            // doble the box value
             end=end+(end-start+1)*2;
            start=newstart;
        }
        return binaryserarch(arr, target, start, end);
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
