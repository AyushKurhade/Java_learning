# 🚖 Encapsulation in Java – Cab Ride Example

## 📌 Definition
Encapsulation is the process of **restricting direct access** to class fields and exposing them only through controlled methods (getters/setters).  
It ensures **data integrity** and prevents unintended modifications.

---

## 🧑‍💻 Code Example

### Class Definition
```java
class CabRideTest {
    private String customerName;
    private double distance;
    private double farePerKM;
    private double totalFare;

    CabRideTest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name : ");
        customerName = sc.nextLine();
        System.out.println("Enter the distance in KM : ");
        distance = sc.nextDouble();
        System.out.println("Enter the fare per KM : ");
        farePerKM = sc.nextDouble();
    }

    void calculateFare() {
        totalFare = distance * farePerKM;
    }

    void displayBill() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Distance : " + distance + " KM");
        System.out.println("Fare per KM : " + farePerKM);
        System.out.println("Total Fare : " + totalFare);
    }
}


public class CabRideMain {
    public static void main(String[] args) {
        CabRideTest t1 = new CabRideTest();
        t1.calculateFare();
        t1.displayBill();

        // ❌ Without encapsulation, this is possible:
        // t1.distance = 25;  // modifies internal state directly
    }
}


###⚠️ Problem Without Encapsulation

Fields are public by default → can be modified directly.
Example: t1.distance = 25; 
changes the value after the bill is calculated.
This leads to inconsistent or incorrect results.

✅ Solution With Encapsulation
Make fields private.
Provide getter/setter methods for controlled access.


private double distance;
private double farePerKM;
private double totalFare;

STACK MEMORY
---------------------
t1  -----------+
               |
               v

HEAP MEMORY
--------------------------------
cabRideTest Object
--------------------------------
customerName = "Ayush"
distance     = 25   <-- Changed
fareperKM    = 15
totalFare    = 150
--------------------------------