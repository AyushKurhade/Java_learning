import java.util.Scanner;

public class _11_removedigit {
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number -");
        
        int n = sc.nextInt(); //123
        
        
        String numString = String.valueOf(n); //"123"=>
        
        System.out.println("Enter number to remove-");
        int removeDigit = sc.nextInt(); //2
        
        String removeDigitString = String.valueOf(removeDigit);
        
        numString = numString.replace(removeDigitString, "");
        
        
        System.out.println(Integer.parseInt(numString));
        
    }
}

    

