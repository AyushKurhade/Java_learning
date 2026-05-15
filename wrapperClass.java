public class wrapperClass {
    
// Objective of wrapper class is to convert primitive data type into object and object into primitive data type


public static void main (String[] args){
    
    
    //********************************* String to int  *************************************                                              

    String s1 = "12";                                   
    String s2 = "34";

    // int a = Integer.parseInt(String variable name );
    
    int a = Integer.parseInt(s1);
    int b = Integer.parseInt(s2);
    System.out.println(a+b); // 46



    //********************************* int to String  *************************************                                              

    int x = 10;
    int y = 20;


    // String s3 = Integer.toString(int variable name);

    // String s3 = Integer.toString(x);             // method 1
    // String s4 = Integer.toString(y);

    String s3 = String.valueOf(x);                  // method 2        
    String s4 = String.valueOf(y);                  // popular method

    System.out.println(s3+s4); // 1020

    
}



}
