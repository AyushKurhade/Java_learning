public class bitwiseOperator_07 {
    public static void main(String[] args) {
       
        // bitwise operator cointains &   ^   |  <<   >> 

        // & :  1 1 -> 1 otherwiswe 0

        // | : 0 0 -> 0 otherwise 1 

        // ^ : 0 0 and 1 1 -> 0 otherwise 1  (donhi same asel tar 0 otherwise 1)


        // ********************* Questions *******************************

        // 5 & 4 
        // 5 -> 0 1 0 1         
        // 4 -> 0 1 0 0         
    // 5 & 4 -> 0 1 0 0 -> 4        donhi true asel tarach true 

    System.out.println("5 & 4 : " + (5 & 4)); // 4

    // 13 & 7
    // 13 -> 0 1 1 0 1  
    // 7  -> 0 0 1 1 1
// 13 & 7 -> 0 0 1 0 1 -> 5

System.out.println("13 & 7 : " + (13 & 7)); // 5

    // 23 | 7 
    // 23 -> 0 1 0 1 1 1
    // 7  -> 0 0 0 1 1 1
// 23 | 7 -> 0 1 0 1 1 1 -> 23
System.out.println("23 | 7 : " + (23 | 7)); // 23

            // 5 & 4 | 3 ^ 6
            // 5 -> 0 1 0 1
            // 4 -> 0 1 0 0
            // 3 -> 0 0 1 1
            // 6 -> 0 1 1 0
// 5 & 4 -> 0 1 0 0 -> 4
 // 3 ^ 6 -> 0 1 0 1 -> 5     ^ cha precedence | cya peksha jast ahe 
// 4 | 5 -> 0 1 0 1 -> 5
System.out.println("5 & 4 | 3 ^ 6 : " + (5 & 4 | 3 ^ 6)); // 5


    }
}