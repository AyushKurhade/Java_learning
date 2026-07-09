import java.util.Scanner;

public class _10_replaceDigit {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number -");

		int n = sc.nextInt(); //123


		String numString = String.valueOf(n); //"123"=>

		System.out.println("Enter number to replace-");
		int removeDigit = sc.nextInt(); //2
		String removeDigitString = String.valueOf(removeDigit);
		
		
		System.out.println("Enter the replacing number -");
		int newNum = sc.nextInt();
		String newNumber = String.valueOf(newNum);

		

		numString = numString.replace(removeDigitString, newNumber);


		System.out.println(Integer.parseInt(numString));

	}
    
}
