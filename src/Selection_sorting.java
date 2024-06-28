import java.util.Arrays;

public class Selection_sorting {

    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 5, 3};
        System.out.println(Arrays.toString(selection(arr)));
    }

    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // find the index of the max element in the array and replace it with index of the element in the end.
            int last = arr.length - i - 1;
            int max = max_index(arr, 0, last); // index of the max element in the array;
            swapp(arr, max, last);
        }
        return arr;
    }

    public static void swapp(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int max_index(int[] arr, int start, int last) {
        int max = start;
        for (int i = start + 1; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
