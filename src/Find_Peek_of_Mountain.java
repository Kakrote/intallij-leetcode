public class Find_Peek_of_Mountain {
    public static void main(String[] args) {
        
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
}
