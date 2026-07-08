 import java.util.Scanner;

public class _06_largestUsingCondictionals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int n = sc.nextInt();

        if (n >= 1000 && n <= 9999) {

            int w = n % 10;
            int x = (n / 10) % 10;
            int y = (n / 100) % 10;
            int z = n / 1000;

            if (w > x && w > y && w > z) {
                System.out.println("Largest digit = " + w);
            } else if (x > y && x > z) {
                System.out.println("Largest digit = " + x);
            } else if (y > z) {
                System.out.println("Largest digit = " + y);
            } else {
                System.out.println("Largest digit = " + z);
            }

        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}