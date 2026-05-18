import java.util.ArrayList;
import java.util.Scanner;
 class Order{
   private String productname;
   private double price;
   private int Quantity;
   public Order(String productname,double price,int Quantity){
    if(price<=0){
        throw new IllegalArgumentException("Unit price must be grester than zero");
    }
    if(Quantity<=0){
        throw new IllegalArgumentException("Quantity must be greater than Zero");
    }
    this.productname=productname;
    this.price=price;
    this.Quantity=Quantity;
   }
   public double calculatetotal(){
    return price*Quantity;
   }
   @Override
   public String toString(){
    return productname+"-"+Quantity+" pcs X "+price+" = "+calculatetotal();
   }
}


public class project4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Order> Order=new ArrayList<>();
        System.out.println("---------Welcome to Basecase Shop--------");
        System.out.println("How many items do you want purchase?");
        int n= sc.nextInt();
        sc.nextLine();
        if(n>5){
            System.out.println("You crossed the limit ,you can only buy 5 items");
            n=5;
        }
        for(int i =1;i<=n;i++){
            System.out.print("Enter Product "+i +" Name: ");
            String name = sc.nextLine();
            System.out.print("Enter price:");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity:");
            int Quantity =sc.nextInt();
            sc.nextLine();
            try{
                Order o =new Order(name, price, Quantity);
                Order.add(o);

            }catch(IllegalArgumentException e){
                System.out.println("Error:"+e.getMessage()+"Skipping item.");
                i--;
            }
        }
        double subtotal =0;
        for(Order o:Order){
           subtotal=subtotal+o.calculatetotal();
        }
        double discountrate;
        if(subtotal>100){
            discountrate=0.20;
        }else if(subtotal>50){
            discountrate=0.10;
        }else{
            discountrate=0.05;
        }
        double discount = subtotal*discountrate;
        double delivery = (subtotal<50)?10:0;
        double finaltotal = subtotal - discount+delivery;
        System.out.println("-------------Final Receipt-----------");
        int count = 1;
        for(Order o:Order){
            System.out.println("Item "+count+":"+o);
            count++;
        }
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Discount: "+discount);
        System.out.println("Delivery Fee: "+finaltotal);
        System.out.println("-------------------------------------");
    }
}