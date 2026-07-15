// pakage Arrays.Search & Sort;
import java.util.Scanner;

class _01_linearSeach {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
     

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
           int search = sc.nextInt();

        for(int i = 0; i < size; i++){
            if(arr[i] == search){
                System.out.println("ELEMENT FOUND AT INDEX:"+i);
                break;
            }
        }


    }
}