public class operators_06 {
    

    // oerator precedence and associativity
    public static void main (String[] args){
        // int a = 10;
        // int b = 20;
        // int c = 30;

        // // example of operator precedence
        // int result = a + b * c; // multiplication has higher precedence than addition
        // System.out.println(result); // 610

        // // example of associativity
        // int result2 = a - b - c; // subtraction has left to right associativity
        // System.out.println(result2); // -40

        int a = 5/2;
        System.out.println(a); 

        float b = 5/2; // int / int then returns int 
        // but value is storing inside the float variable so it will convert int to float and store it in b
        System.out.println(b);

        // float c = 5/ 2.0;
        // incompatible types: possible lossy conversion from double to float
        // System.out.println(c); // 2.5 because 2.0 is double and double has higher precedence than int
        //  so it will convert 5 to double and then perform the division and return double value and store it in float variable c

        float c = 5/ 2.0f;
        System.out.println(c);


            // ***************************** mod oeprator %******************************* 
            // mothya numbeer ne chotya number la mod kela tr chota number return hoto
            System.out.println(5 % 65); // 5 
            System.out.println(6 % 18); // 6 



    }
}
