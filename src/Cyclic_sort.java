import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        System.out.println(Arrays.toString(cyclic(arr)));
    }
    static int []cyclic (int []arr){
        int i=0;
        int l=arr.length;
        while(i<l){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swapp(arr,i,correct);
            }
            else{
                i++;
            }
        }
        return arr;
    }
    static int[] swapp(int[] arr,int i,int correct){
        int temmp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temmp;
        return arr;
    }
}
