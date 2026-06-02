// package Classes&Obj;

import java.util.Scanner;

class employeeAttendence{
    String empName;     
    int empId;
    int presentDays;
    int totaldays;
    float attendence;

    void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the employee id : ");
        empId = sc.nextInt();

        // Consume the newline character left by nextInt()
        sc.nextLine();

 
        System.out.println("Enter the name of an employee : ");
        empName =  sc.nextLine();

        System.out.println("Enter the working days of an employee : ");
        presentDays = sc.nextInt();

        System.out.println("Enter the total days in a month : ");
        totaldays = sc.nextInt();
    }

    void calculateattendence(){
        attendence = (float)presentDays/totaldays*100;

    }

    void displayInfo(){
        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Present Days : " + presentDays);
        System.out.println("Total Days : " + totaldays);
        System.out.printf("Attendence : %.2f%%\n", attendence);
    }

    
}
public class _04_employeeAttendence {
    public static void main(String[] args){
        employeeAttendence emp1 = new employeeAttendence();
        emp1.getInfo();
        emp1.calculateattendence();
        emp1.displayInfo();

    }
}

