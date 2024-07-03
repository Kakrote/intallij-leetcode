public class countinggsoort {
    public static void countingsort(int arr[]) {
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largestElement = Math.max(largestElement, arr[i]);
        }

        int count[] = new int[largestElement + 1]; // Assuming all values are non-negative
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i <= largestElement; i++) { // Iterate up to largestElement
            while (count[i] > 0 && j < arr.length) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 2, 3, 3, 4, 5, 6, 6, 7 };
        countingsort(arr);
        printArr(arr);
    }
}
