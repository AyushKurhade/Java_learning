import java.util.Scanner;
public class _02_LogicOfLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();


//         Here’s the rule:

// ✅ A year is a leap year if it is divisible by 4.

// ❌ But if the year is also divisible by 100, it is not a leap year.

// ✅ However, if the year is divisible by 400, then it is

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");

    }
}
