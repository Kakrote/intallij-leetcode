public class Median_of_Two_Sorted_Array {
    public static void main(String[] args) {
        
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int nums3[] = new int[n];
    
        // Merge nums1 and nums2 into nums3
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }
    
        for (int i = nums1.length; i < n; i++) {
            nums3[i] = nums2[i - nums1.length];
        }
    
        // Sorting the array in ascending order
        int temp = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums3[j] > nums3[j + 1]) {
                    temp = nums3[j];
                    nums3[j] = nums3[j + 1];
                    nums3[j + 1] = temp;
                }
            }
        }
    
        // Searching for the median in the array
        int mid = (n - 1) / 2;
        if (n % 2 == 0) {
            // If n is even, median is average of two middle elements
            return (nums3[mid] + nums3[mid + 1]) / 2.0;
        } else {
            // If n is odd, median is the middle element
            return nums3[mid];
        }
    }
    
}
