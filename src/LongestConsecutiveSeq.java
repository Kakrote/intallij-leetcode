import java.util.Arrays;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        LongestConsecutiveSeq oj = new LongestConsecutiveSeq();
        int[] nums = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        int sol = oj.longestConsecutive(nums);
        System.out.println(sol);
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums); // Sorting the array
//        System.out.println(Arrays.toString(nums));

        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            if (nums[i] == nums[i - 1] + 1) {
                currentCount++; // Continue the sequence
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1; // Reset count for a new sequence
            }
        }

        return Math.max(maxCount, currentCount);
    }
}
