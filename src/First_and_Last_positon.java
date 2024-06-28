/**
 * First_and_Last_positon
 */
public class First_and_Last_positon {

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 7, 8, 9, 9, 9, 10};
        int target = 9;
        int a[] = position(arr, target);
        System.out.println(java.util.Arrays.toString(a));

    }

    public static int[] position(int[] nums, int target)  {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int search(int[] arr, int target, boolean isstart) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isstart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
