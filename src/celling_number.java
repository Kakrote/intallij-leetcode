public class celling_number {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 9, 14, 16, 18};
        int target = 1;
        int a = ceiling(arr, target);
        System.out.println(a);
    }

    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // If the target is not found in the array
        // and start is pointing to the next greater element
        // or if start is out of bounds, return -1 (indicating not found)
        if (start < arr.length) {
            return arr[start];
        } else {
            return -1; // Return -1 or any other suitable value
        }
    }
}
