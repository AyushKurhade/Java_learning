
// package Strings;

public class strings_02 {

    public static void main (String[] args)
{
    String s1 = "Hello";
    s1 = s1.toLowerCase(); // s1 becomes "hello"
    System.out.println(s1.toLowerCase()); // hello
    System.out.println(s1.toUpperCase()); // HELLO
    System.out.println(s1.startsWith("h")); 
    System.out.println(s1.endsWith("lo")); // true
    // apart from this these asre just modifications not stored in an var
        System.out.println(s1); 

}    
}
