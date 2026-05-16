public class bitwiseShift_08 {

    // << left shift operator
    // >> right shift operator

    public static void main(String[] args) {

        /*
         * Left Shift (<<)
         * x << n means shifting the bits of x n places to the left.
         * For positive integers (typical idea): x << n = x * 2^n
         *
         * Right Shift (>>)
         * x >> n means shifting the bits of x n places to the right.
         * For positive integers (typical idea): x >> n = x / 2^n
         */


        // ********************* Questions (5) *********************

        // Q1) 5 << 2
        // 5 << 2 means shifting the bits of 5 left by 2 places.
        // Because 2^2 = 4, so 5 * 4 = 20
        // Answer: 20

        System.out.println("5 << 2 = " + (5 << 2));

        // Q2) 12 << 1
        // 12 << 1 = 12 * 2^1 = 12 * 2 = 24
        // (Meaning: shifting left by 1 doubles the value)

        // Answer: 24
        System.out.println("12 << 1 = " + (12 << 1));

        // Q3) 20 >> 2
        // 20 >> 2 = 20 / 2^2 = 20 / 4 = 5
        // (Meaning: shifting right by 2 divides by 4)
        // Answer: 5

        System.out.println("20 >> 2 = " + (20 >> 2));

        // Q4) 9 >> 1
        // 9 >> 1 = 9 / 2^1 = 9 / 2 = 4 (integer division)
        // Since it is an integer, the fractional part is discarded.
        // Answer: 4

        System.out.println("9 >> 1 = " + (9 >> 1));

        // Q5) 7 << 3
        // 7 << 3 = 7 * 2^3 = 7 * 8 = 56
        // Shifting left by 3 places multiplies the value by 8.

        // Answer: 56
        System.out.println("7 << 3 = " + (7 << 3));
    }
}

