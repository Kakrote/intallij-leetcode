/**
 * Candy_Problem
 */
public class Candy_Problem {

    public static void main(String[] args) {
        int arr[]={1,2,80,80,80,2,1};
        Candy_Problem cp=new Candy_Problem();
        int ans=cp.candy(arr);
        System.out.println(ans);
    }
    //find the peek first
    public int peek_element(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]) start=mid+1;
            else if(arr[mid]>arr[mid+1]) end=mid;
            else return mid;
        }
        return start;
    }
    public int candy(int[] ratings) {
        int candy = ratings.length;
        int peek = peek_element(ratings);
        System.out.println(peek);
    
        // check the left side of the array;
        int start = 0;
        int end = peek;
        while (start < end) {
            if (ratings[start] < ratings[start + 1]) {
                candy++;
            } else {
                break;
            }
            start++;
        }
    
        // check the right side of the peek
        start = peek+1;
        end = ratings.length - 1;
        while (start < end) {
            if (ratings[start] > ratings[start + 1]) {
                candy++;
            } else {
                break;
            }
            start++;
        }
    
        return candy;
    }
    
    
}