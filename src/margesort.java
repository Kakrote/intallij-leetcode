import java.util.Arrays;

public class margesort {
    public static void main(String[] args) {
        int arr[]={2,1,3,5,8,4};
        arr=margesorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int []margesorting(int []arr){
        if(arr.length==1){
            return  arr;
        }
        int mid=arr.length/2;
        int []left=margesorting(Arrays.copyOfRange(arr,0,mid));
        int []right=margesorting(Arrays.copyOfRange(arr,mid,arr.length));
        return marge(left,right);
    }

    public static int[] marge(int[] left, int[] right) {
        int mix[]=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else {
                mix[k]=right[j];
                j++;
            }
            k++;

        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
