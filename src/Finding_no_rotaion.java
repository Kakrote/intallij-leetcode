public class Finding_no_rotaion {
    public static void main(String[] args) {
        int arr[]={11,12,14,15,18,2,3,6};
        int no_of_rotation=count_rotation(arr);
        System.out.println(no_of_rotation);
    }
    // this will find us the pivot in the array.
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
    //  now after getting the pivot be have to find the numbers before the pivot
    // and +1 then we will get the answer.
    static int count_rotation(int []arr){
        int pivot=find_Pivot(arr);
        if(pivot!=-1){
            return pivot+1;
        }
        return -1;
    }
}
