// import java.lang.reflect.Array;
import java.util.Arrays;

public class Binary_Search_in_2D_Array {
    public static void main(String[] args) {
        int [][]arr={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,59},
            {32,34,49,60}
        };
        int target=34;
        int len=arr.length;
        System.out.println(len);
        System.out.println(Arrays.toString(search_in_2d(arr, target)));
    }
    static int[] search_in_2d(int [][]arr,int target){
        int row=0;
        int col=arr.length-1;
        while (row<arr.length && col>=0) {
            if(arr[row][col]==target){
                return new int[]{row,col};

            }
            else if(arr[row][col]<target){
                row++;
            }
            else {
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
