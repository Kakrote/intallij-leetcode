

import java.util.Arrays;

/**
 * MurgeeSort
 */
public class MurgeeSort {

    public static void main(String[] args) {
        int arr[]={2,3,5,1,8,4};
        arr= mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int arr[]) {
        // this is the base condtion where the function will retun 
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;  // Ensure correct mid calculation
        // we will split the arrays into two sub arrays 
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return marge(left, right);
    }

    public static int []marge(int []first,int []secound){
        int[]mix=new int[first.length+secound.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length && j<secound.length) {

            if(first[i]<secound[j]){
                mix[k]=first[i];
                i++;
                
            }
            else{
                mix[k]=secound[j];
                j++;
            }
            k++; // the value of k should increase in both the condition's.
            
        }
        // now if any of the two arrays have the extra elements in them in that case we have to add those extra elements into the last of the array
        while (i<first.length) {

            mix[k]=first[i];
            i++;
            k++;
            
        }
        while (j<secound.length) {

            mix[k]=secound[j];
            j++;
            k++;
            
        }
        // either of them will excute according to the condition gets true 
        return mix;
    }
}