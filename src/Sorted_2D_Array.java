import java.util.Arrays;

public class Sorted_2D_Array {

    public static void main(String[] args) {
        int [][] matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int []ans=searching(matrix, 14);
        System.out.println(Arrays.toString(ans));
    }
    // search in the row provided 
    static int[]binarary_search(int [][]matrix,int row,int cstart,int cend,int target){
        while (cstart<=cend) {
            int mid=cstart+(cend-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            else if(matrix[row][mid]<target){
                cstart=mid+1;
            }
            else{
                cend=mid-1;
            }

        }
        return new int[]{-1,-1};
    }
    static int[] searching(int [][]arr,int target){
        int row=arr.length;
        int col=arr[0].length-1;
        if(row==1){
            return binarary_search(arr, 0, 0, col-1, target);

        }
        int rstart=0;
        int rend=row-1;
        int cmid=col/2;
        while (rstart<(rend-1)) {
            int mid=rstart+(rend-rstart)/2;
            if(arr[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            else if(arr[mid][cmid]<target){
                rstart=mid+1;
            }
            else{
                rend=mid-1;
            }

        }
        if(arr[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        else if(arr[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        if(target<=arr[rstart][cmid-1]){
            binarary_search(arr, rstart, 0, cmid-1, target);
        }
        else if(target>=arr[rstart][cmid+1] && target<=arr[rstart][col-1]){
            binarary_search(arr, rstart, cmid+1, col-1, target);

        }
        else if(target<=arr[rstart+1][cmid]){
            binarary_search(arr, rstart+1, 0, cmid-1, target);

        }
        else{
            binarary_search(arr, rstart+1, cmid+1, col-1, target);
        }
        return new int[]{-1,-1};

    }
}