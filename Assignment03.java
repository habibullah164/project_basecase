class Order {

    public String productName;
    private double unitPrice;
    private int quantity;

    public Order(String name, double price, int qty) throws Exception {

        if (price <= 0) {
            throw new Exception("Unit price must be greater than zero.");
        }

        if (qty <= 0) {
            throw new Exception("Quantity must be greater than zero.");
        }

        this.productName = name;
        this.unitPrice = price;
        this.quantity = qty;
    }

    public void setUnitPrice(double price) throws Exception {

        if (price <= 0) {
            throw new Exception("Unit price must be greater than zero.");
        }

        this.unitPrice = price;
    }

    public void setQuantity(int qty) throws Exception {

        if (qty <= 0) {
            throw new Exception("Quantity must be greater than zero.");
        }

        this.quantity = qty;
    }

    public double calculateTotal() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return productName + " - " + quantity +
                " pcs x " + unitPrice +
                " = " + calculateTotal();
    }
}

public class Assignment03 {

    public static void main(String[] args) {

        System.out.println("--- Order Test ---");

        try {

            Order o1 = new Order("Gaming Mouse", 25.75, 3);
            Order o2 = new Order("Mechanical Keyboard", 120.0, 1);

            System.out.println(o1);
            System.out.println(o2);

            System.out.println("\n--- Invalid Order Attempt ---");

            Order o3 = new Order("Headphones", -50, 2);

            System.out.println(o3);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
