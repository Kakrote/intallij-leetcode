import java.util.Arrays;

public class BoobleSortUsingRecursion {
    public static void main(String[] args) {
        int arr[]={5,1,2,7,3,0};
        int r=arr.length-1;
        booblesort(arr,r, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void booblesort(int []arr,int r,int c){

        if(r==0){
            return;
        }
        if(c<r){
            // swaping the elements 
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            booblesort(arr, r, c+1);
        }
        else booblesort(arr, r-1, 0);

    }
}
