import java.util.Scanner;

public class _02_largestElement {
    public static void main(String[] args) {
         System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 12345
        int largest = 0;
        while(n!=0){
            int d = n % 10;
            if(d>largest){
                largest = d;
            }
            n = n / 10;
        }
        System.out.println(largest);
    }  
    
}
