
// puseudocode based question 

#include<stdio.h>
int main(){
    int a = 5;
    if (a)                       
    {                           
        printf("hello");        // always executes because a is non-zero (true)
                                
    }                           
    else
    {                           
        printf("bye");      // never executes until a is zero (false)
    }






    if (a == 5)
    {
    printf("hello");        // executes because a is equal to 5
    }
    else
    {
    printf("bye");      // never executes because a is not equal to 5
    }





    if (1 && 1)
    {
    printf("hello");        // executes because both conditions are true
    }
    else
    {
    printf("bye");      // never executes because the condition is true
    }



    if(a=0)
    {
    printf("hello");        // never executes because a is assigned 0 (false)
    }
    else
    {
    printf("bafello"); // bafello 
    }



    return 0;
}