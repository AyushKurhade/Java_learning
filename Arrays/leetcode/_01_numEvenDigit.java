// package Arrays.leetcode;

public class _01_numEvenDigit {
    
     // Your original solution method
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int n : nums) {
            int counter = 0;
            while (n > 0) {
                n = n / 10;
                counter++;
            }
            if (counter % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    // Main method to run and test the code
    public static void main(String[] args) {
        _01_numEvenDigit tester = new _01_numEvenDigit();

        // Test Case 1: Expected output is 2 (12 and 7896 have even number of digits)
        int[] nums1 = {12, 345, 2, 6, 7896};
        System.out.println("Test 1 Result: " + tester.findNumbers(nums1)); 

        // Test Case 2: Expected output is 1 (555 has 3 digits, 901 has 3 digits, 4821 has 4 digits)
        int[] nums2 = {555, 901, 4821, 99999};
        System.out.println("Test 2 Result: " + tester.findNumbers(nums2)); 
    }
}
}
