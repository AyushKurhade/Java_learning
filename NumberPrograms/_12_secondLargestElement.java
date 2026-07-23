import java.util.Arrays;
public class _12_secondLargestElement {
    public static void main(String[] args){
        int n = 5246;
       
        while(n != 0) {
             int arr[] = new int[4];
            arr[0] = n % 10;
            arr[1] = n / 10 % 10;
            arr[2] = n / 100 % 10;
            arr[3] = n /1000;
            Arrays.sort(arr);
             System.out.println(arr[2]);
             break;

        }
       

    }
    
}
