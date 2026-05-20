public class _11_if_else {
    
// pseudo code based example 
// in c langauge if(a){} as a cointain 
// any integer the if block will execute 
// if anf only iff a is not zero
// in java if(a){} is not valid as a is an integer and java is a strongly typed language

 
        
        public static void main(String[] args) {
            
        

        int a = 10;

        if(a>5)    
        {
            System.out.println("hello");   
        }
        else 
        {
            System.out.println("bye");
        }



        // if(a)
        // {
        //   System.out.println("hello");
        // }   
        // incompatible types: int cannot be converted to boolean
        // else 
        // {
        //     System.out.println("bye");
        // }

       

        int b = 5;

        if(b > 2)
            System.out.println("hello");
        else
            System.out.println("Hi");
            // hello



            // int c = 5;
            // if(c > 2);    // if(c > 2){};       // semicolon is the end of statement 
            // System.out.println("hello, brother");
            // // Always print "hello, brother" 
             


            // int d = 5;
            // if(d> 4); // end ider hi ho gaya ab iske baad else block chahiye tha 
            // // but print statement aa gaya isiliye else without if ka error aya hai 
            //     System.out.println("hello, brother");
            // else 
            //     System.out.println("hi, Father");
            // else without if is not valid
            // misplace else 


                // ***************** break statement in if else *****************
                // break statement is not allowed in if else block
                // it is only allowed in loop and switch case block

                // int e = 5;
                // if(e > 2)
                // {
                //     System.out.println("hello"); 
                //     break;  
                //     // break statement is not allowed in if else block
                // System.out.println("hi");
                // }
                // else{
                //     System.out.println("bye");

                // }
                // System.out.println("hello, brother");


    }
}
