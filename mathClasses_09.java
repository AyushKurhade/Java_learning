public class mathClasses_09 {
    public static void main(String[] args) {
        // Java provides various mathematical functions and constants.
        // It is part of the java.lang package, so you don't need to import it to use its methods.


        // 1. Math.abs(x): Returns the absolute value of x.
        System.out.println("Math.abs(-5) : " + Math.abs(-5)); // 5

        // 2. Math.sqrt(x): Returns the square root of x.
        System.out.println("Math.sqrt(16) : " + Math.sqrt(16)); // 4.0



        //**********************************************************************
        //math.pow and math.sqrt returns the output in double 
        //make sure to type case before storing it in int variable
        // **********************************************************************



        // 3. Math.pow(a, b): Returns a raised to the power of b.
        System.out.println("Math.pow(2, 3) : " + Math.pow(2, 3)); // 8.0

        // 4. Math.max(a, b): Returns the maximum of a and b.
        System.out.println("Math.max(10, 20) : " + Math.max(10, 20)); // 20

        // 5. Math.min(a, b): Returns the minimum of a and b.
        System.out.println("Math.min(10, 20) : " + Math.min(10, 20)); // 10

        // 6. Math.random(): Returns a random double value between 0.0 (inclusive) and 1.0 (exclusive).
        System.out.println("Math.random() : " + Math.random()); // Random value between 0.0 and 1.0

        // math.round(x): Rounds x to the nearest integer 
        System.out.println("Math.round(3.6) : " + Math.round(3.6)); // 4

        // math.ceil(x): Rounds x up to the nearest integer
        System.out.println("Math.ceil(3.2) : " + Math.ceil(3.2)); // 4.0

        // math.floor(x): Rounds x down to the nearest integer

        System.out.println("Math.floor(3.8) : " + Math.floor(3.8)); // 3.0
    }
}
