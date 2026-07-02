// package NumberPrograms;
import java.util.Scanner;

public class sumOfNum_01 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int sum = 0;
 // 12345
 while(n!=0){
    int d = n % 10; // 5
    sum = sum + d; // 0 + 5 = 5
    n = n / 10; // 1234
 }
 System.out.println(sum);
    } 
}
