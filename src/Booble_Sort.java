import java.util.Arrays;

public class Booble_Sort {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        Booble_Sort bs=new Booble_Sort();
        int ans[]=bs.sorting(arr);
        System.out.println(Arrays.toString(ans));
    }
    public int[] sorting(int []arr){
        int temp=0;
        boolean swap=false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){ // here we are taking j upto length -1 becoz as we know that the last element in every phase will come in there respective position and so we dont have to check them again and again.
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        return arr;
    }
}
