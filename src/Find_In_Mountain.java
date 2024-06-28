public class Find_In_Mountain {
    public static void main(String[] args) {
        
    }
    public interface MountainArray {
        
        
    }
    int serach(int []arr,int target){
        int peek=peakIndexInMountainArray(arr);
        int fist_serch_in=binaryserarch(arr, target, 0, peek);
        if(fist_serch_in!=-1){
            return fist_serch_in;
        }
        return binaryserarch(arr, target, peek+1, arr.length-1);
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        return -1;
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid=start+(end-start)/2;
            //  checks if the midle value lies in the accending side of the array or decending side of the array
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else return mid;
        }
        return start; // we can return end as well as both are pointing to the same index in the array.
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
