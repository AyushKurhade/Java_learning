import java.util.Scanner;
public class _12_Scanner_class {


    // If you call nextInt() but the user types “hello,” the program crashes with InputMismatchException.

     public static void main(String[] args) {
        // Step 1: Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Step 2: Take different types of input
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // reads full line

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // reads integer

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble(); // reads decimal

        // Step 3: Display the inputs back
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        // Step 4: Close the scanner
        sc.close(); 
        // not used by many programmer but 
        // just my compiler shows err msg thats why i am closing it

         


 

    }
}
