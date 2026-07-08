import java.util.Scanner;

public class _07_sumofOddIndexElements  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 999 && n <= 9999) {

            int w = n % 10;
            int m = (n / 100) % 10;

            int sum = w + m;

            System.out.println(sum);

        } else {
            System.out.println("Invalid Input");
        }
    }
}