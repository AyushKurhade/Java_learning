import java.util.Scanner;

public class _09_sumOfOddEvenEqual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 999 && n <= 9999) {

            int m = n % 10;
            int w = (n / 100) % 10;

            int i = (n / 10) % 10;
            int j = n / 1000;

            if ((m + w) == (i + j)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        } else {
            System.out.println("Invalid Input");
        }
    }
}