    import java.util.Scanner;


public class _03_upperOrlower {
 

// Character.isUpperCase(ch)
// 🔰 Explanation:
// Character → A wrapper class for working with characters.
// isUpperCase(ch) → Returns true if the character ch is uppercase (A–Z), 
// otherwise false.

// only checcks for first character of the string,
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch))
            System.out.println("Uppercase");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase");
        else
            System.out.println("Not an alphabet");
    }
}

    

