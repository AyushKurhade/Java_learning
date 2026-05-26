 
import java.util.Scanner;

class Mobile{
	
	String brandName;
	String modelName;
	int price;
	
	void acceptMobileDetails() {
		
		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter Brand Name : " );
		brandName = sc.nextLine();
		System.out.println("Enter Model Name : " );
		modelName = sc.nextLine();
		System.out.println("Enter Price : " );
		price = sc.nextInt();	
	}
	void displayMobileDetails() {
		System.out.println("Brand name : "+ brandName);
		System.out.println("Model name : "+ modelName);
		System.out.println("Price : "+  price);
		System.out.println();
		System.out.println("*****************************************************");
	}
	
}

public class _02_MobileInfo {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.acceptMobileDetails();
		m1.displayMobileDetails();
		
		Mobile m2 = new Mobile();
		m2.acceptMobileDetails();
		m2.displayMobileDetails();
		
		Mobile m3 = new Mobile();
		m3.acceptMobileDetails();
		m3.displayMobileDetails();
		}
}
