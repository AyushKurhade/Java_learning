import java.util.Scanner;

class smallestNumber {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
         
        n = Math.abs(n); // if -ve convert it into +ve
        
        int small = 9;
        while (n > 0) {
            int d = n % 10; 
            if (d < small) {
                small = d;  
            n = n / 10;     
        }
        }
        System.out.println("Smallest digit is: " + small);

    }
}
