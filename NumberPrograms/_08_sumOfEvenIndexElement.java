import java.util.Scanner;

public class _08_sumOfEvenIndexElement {
    
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 999 && n <= 9999) {

            int x = (n / 10) % 10;
            int y = n / 1000;

            System.out.println(x + y);

        } else {
            System.out.println("Invalid Input");
        }
    }
}
