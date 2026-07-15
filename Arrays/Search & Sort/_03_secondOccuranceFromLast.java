
import java.util.Scanner;
public class _03_secondOccuranceFromLast {

	public static void main(String[] args) {
		
		System.out.println("Enter the Size of an array:");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the elements in an array:");
		for(int i = 0; i<size; i++) {
			arr[i] =sc.nextInt();
		}
		 // element at third occurrence from last 
		System.out.println("Enter the element to search : ");
		int search = sc.nextInt();
		
		boolean found = false;
		int counter = 0;
		
		for( int i = size-1; i>=0 ; i--) {
			if(arr[i]==search) {
				counter++;
			}
			if(counter==3) {
				found = true;
				System.out.println("Element found at index : "+i);
				break;
			}
			
		}
		if(!found) {
			System.out.println("Elemet does not found");
		}
	}

}
