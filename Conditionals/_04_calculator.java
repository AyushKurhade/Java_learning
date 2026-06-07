// package Condictional_Statements;

import java.util.Scanner;

public class _04_calculator {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Operator : ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();

        switch(ch){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '%' :
                System.out.println(a%b);
                break;

            default :
            System.out.println("Wrong operator");


        }







}


    }
   