import java.util.Scanner;
public class Assignment_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
                System.out.println("--------------------------------------");
        System.out.println("-------Welcome to BaseCase Shop-------");
        System.out.println("--------------------------------------");
        System.out.print("How many Product you want?(max 5): ");
        int n=sc.nextInt();
        if(n>5){
            System.out.println("You cross the limit! You can buy only 5 product.");
            n=5;
        }
        if(n<=0){
            System.out.println("You do not buy any product");
            break;
        }
          String[] productName = new String[n];
        double[] prices = new double[n];
        int[] Quantities = new int[n];
        double Subtotal=0;
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.print("Enter Product "+(i+1)+" Name: ");
            productName[i]=sc.nextLine();
            System.out.print("Enter Price: ");
            double price =sc.nextDouble();
            if(price<=0){
                System.out.println("Invalid quantity! Skipping this item.");
                i--;
                continue;
            }
            System.out.print("Enter Quantity:");
            int qty = sc.nextInt();
            if(qty<=0){
                System.out.println("Invalid quantity! Try again.");
                i--;
                continue;
            }
            prices[i]=price;
            Quantities[i]=qty;
            Subtotal +=price*qty;
        } 
        double discount;
        if(Subtotal>100){
            discount=Subtotal*0.20;
        }else if(Subtotal>50){
            discount=Subtotal*0.10;
        }else{
            discount=Subtotal*0.05;
        }
        double deliveryFee =(Subtotal<50)?10:0;
        double finalTotal=Subtotal-discount+deliveryFee;
        System.out.println("---------------------------------");
        System.out.println("-----------Final receipt---------");
        System.out.println("---------------------------------");
        for(int i=0;i<n;i++){
            double itemTotal = prices[i]*Quantities[i];
            System.out.println("Item "+(i+1)+": "+productName[i]+"-"+Quantities[i]+"x"+prices[i]+"="+itemTotal);
        }
        System.out.println("Subtotal: "+Subtotal);
        System.out.println("Discount Applied: "+discount);
        System.out.println("Delivery Fee: " +deliveryFee );
        System.out.println("Final Total: "+finalTotal);
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("----Thanks for visiting us sir--------");
        System.out.println("                                       ");
        System.out.println("                                       ");
        }
    
       
    }
}