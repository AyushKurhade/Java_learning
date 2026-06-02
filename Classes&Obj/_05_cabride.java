import java.util.Scanner;

class cabRideTest{

    private String customerName;
    private double distance;
    private double fareperKM;
    private double totalFare;

    cabRideTest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name : ");
        customerName = sc.nextLine();
        System.out.println("Enter the distance in KM : ");
        distance = sc.nextDouble(); 
        System.out.println("Enter the fare per KM : ");
        fareperKM = sc.nextDouble();    

    }
    void calculateFare(){
        totalFare = distance * fareperKM;
    }

    void displayBill(){
        System.out.println("Customer Name : " + customerName);
        System.out.println("Distance : " + distance + " KM");
        System.out.println("Fare per KM : " + fareperKM);
        System.out.println("Total Fare : " + totalFare);
    }

}


public class _05_cabride {
    public static void main (String[] args){
        cabRideTest t1 = new cabRideTest();
        t1.calculateFare();
        t1.displayBill(); 
        // t1.distance = 25;

    }
}
