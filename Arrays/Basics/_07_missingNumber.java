// package Arrays.Basics;

public class _07_missingNumber {

       public static void main(String[] args) {
         int[] arr = {1, 2, 4, 5, 6}; // 3 is missing
        int n = arr.length + 1;      // total numbers should be 6

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        int missing = totalSum - arraySum;
        System.out.println("Missing Number: " + missing);
    }
    
}
