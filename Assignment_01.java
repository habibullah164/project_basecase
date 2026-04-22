import java.util.Scanner;

public class Assignment_01 {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Habib Shop ---");
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Product Name : ");
        String ProductName = sc.nextLine();
        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity =sc.nextInt();
        double subtotal= price*quantity;
        double discount = subtotal * 0.15;
        double finalPrice = subtotal - discount;
        int roundedtotal = (int )finalPrice;
        System.out.println("--- Final Receipt ---");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Total (Rounded Down) : $" + roundedtotal);
        System.out.println("--------------------------");

}
    
}
