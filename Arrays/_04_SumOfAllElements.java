package Arrays;
import java.util.Scanner;
public class _04_SumOfAllElements {
  
    public static void main (String[] args){
        int sum = 0;
System.out.println("enter the Size of an array : ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the Elements of an array :" );
for(int i = 0 ; i < n ; i++){
    arr[i] = sc.nextInt();
}

for(int arr1 : arr){
    sum = sum + arr1;
    System.out.println(arr1);

}
System.out.println("The sum of all elements in an array is : " + sum);





    }
}
