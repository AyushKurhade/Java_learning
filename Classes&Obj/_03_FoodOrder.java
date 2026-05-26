 
 import java.util.Scanner;

class FoodOrder {
    String itemName;
    int quantity;
    int price;
    double totalBill;
    double discount;
    double finalBill;

    void acceptOrder() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();
        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
        System.out.print("Enter Price: ");
        price = sc.nextInt();
    }

    void calculateBill() {
        totalBill = quantity * price;
        if (totalBill > 500) {
            discount = totalBill * 0.10;   // 10% discount
        } else {
            discount = 0;
        }
        finalBill = totalBill - discount;
    }

    void displayBill() {
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Bill: " + finalBill);
    }
}

public class _03_FoodOrder {
    public static void main(String[] args) {
        FoodOrder fo = new FoodOrder();
        fo.acceptOrder();
        fo.calculateBill();
        fo.displayBill();
    }
}
 
