import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int []arr={5,1,2,1,4};
        System.out.println(Arrays.toString(insertion(arr)));
    }
    static int []insertion(int []arr){
        int l=arr.length;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j>0;j--){
                int temp=0;
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
}
