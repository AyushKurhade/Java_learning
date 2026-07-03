import java.util.Scanner;

public class diffrence {
     public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        n = Math.abs(n);

        int small = 9;
        int large = 0;

        while (n > 0) {
            int d = n % 10;
            
            if (d < small) {
                small = d;
            }
            if (d > large) {
                large = d;
            }
            
            n = n / 10;
        }

        int difference = large - small;

        System.out.println("Smallest digit: " + small);
        System.out.println("Largest digit: " + large);
        System.out.println("Difference: " + difference);
        
        
    }
}
