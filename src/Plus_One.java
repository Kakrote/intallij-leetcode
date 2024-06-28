import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int arr[]={1,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    static public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // Start with 1 to add
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum >= 10) {
                carry = 1;
                digits[i] = sum - 10;
            } else {
                carry = 0;
                digits[i] = sum;
                break; // No need to continue if there is no carry
            }
        }
        
        // If carry remains after the loop, we need an additional digit
        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            for (int i = 1; i < n + 1; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        } else {
            return digits;
        }
    }
    
    
}