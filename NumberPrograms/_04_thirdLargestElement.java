  import java.util.Scanner;
public class _04_thirdLargestElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt(); 
        int largest = 0; 
        int t1 = n; 
        int t2 = n; 
        while (n != 0) { 
            int d = n % 10; 
            if (d > largest) { 
                largest = d; 
            } 
            n = n / 10; 
        } 
        int secLargest = 0; 
        while (t1 != 0) { 
            int d = t1 % 10; 
            if (d > secLargest && d != largest) { 
                secLargest = d; 
            } 
            t1 = t1 / 10; 
        } 
        int thirdLargest = 0; 
        while (t2 != 0) { 
            int d = t2 % 10; 
            if (d > thirdLargest && d != largest && d != secLargest) { 
                thirdLargest = d; 
            } 
            t2 = t2 / 10; 
        } 
        
        System.out.println(largest); 
        System.out.println(secLargest); 
        System.out.println(thirdLargest);
    }
}

    


