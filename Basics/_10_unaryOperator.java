

class unaryOperator {
    public static void main(String[] args) {
        
        // a++ - use the value of a, then increment a
        // ++a - increment a, then use the value of a

        int z = 5;
        int b = z++ + ++z + z++ + ++z;
                // 5  + 7 + 7  + 9
        System.out.println("Value of b: " + b);

        int p = 5;
        p = p++;
        System.out.println("Value of p: " + p);



        int x = 10;
        int y = x-- - --x;
        System.out.println("Value of y: " + y);


// ***************** tricky part *****************

int i = 0;
for(int k = 0; k < 5; k++) { i = i++; }
System.out.println(i); // 0 
// i = i++ always assigns the old i back to i (postfix trap). i never actually increments. Prints 0.

int m = 5;
if(m++ == 5) System.out.println("yes");
else System.out.println("no");
// a++ evaluates to 5 (old value) for the comparison. 5 == 5 is true, so 'yes' is printed. After: a = 6.

int c = 3;
System.out.println(c++ + "" + c);
// a++ gives 3 (string concat: '3'), then a is now 4. '' + 4 = '34'. Prints 34.

// *******************************
// int a = 5;                    *
// System.out.println(++(a++));  *
// *******************************
// ++(a++) doesn't compile. a++ produces a value (rvalue), not a variable.
//  You can't apply ++ to a value — it needs a variable. 
// Java throws: 'unexpected type — variable required, value found'.



int a = 4;
int bb = (a > 3) ? a++ : ++a;
System.out.println(bb + " " + a); // 4 5 




int aa = 2;
int bB = aa << aa++; // aa++ = 2 (old value), then aa becomes 3. So it's 2 << 2.
 // 2 << = 2 * 2^ 2 = 8 
System.out.println(bB); // 8



int aaa = 6;
int bbb = aaa % --aaa;
System.out.println(bbb); // 6 % 5 = 1. Prints 1.



    }
}