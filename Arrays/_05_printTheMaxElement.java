package Arrays;

import java.util.Scanner;

public class _05_printTheMaxElement {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();

        }
       
        System.out.println();
        int max = 0;
        for(int i = 0;i <n; i++){

            max = arr[0];
            if(arr[i]>max){
                max = arr[i];
            }
            else{
                max = max;
            }


        }
        
        System.out.println("The maximum element in an array is : " + max);


    }
    
}
