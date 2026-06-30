import java.util.HashSet;
// using hashmap
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,4,5};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        for(int num : set){
            System.out.print(num + " ");
        }
    }
}