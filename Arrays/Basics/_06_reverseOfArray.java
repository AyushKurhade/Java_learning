import java.util.Arrays;

public class _06_reverseOfArray {
    
        public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        int start = 0;              // first index
        int end = arr.length - 1;   // last index
        
        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // move pointers
            start++;
            end--;
        }
        
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}


