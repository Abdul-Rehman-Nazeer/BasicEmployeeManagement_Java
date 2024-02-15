//        If you are developing an online shopping cart system. Create a Java class called CartItem to
//        represent items that users can add to their shopping cart. Each CartItem object should have the
//        following attributes and methods:
//        Attributes:
//        • productName (String)
//        • price (double)
//        • quantity (int)
//        Methods:
//        • calculateTotalPrice(): Calculates the total price of the items in the cart (price * quantity).
//        • displayCartItemDetails(): Displays the details of the cart item, including the product name,
//        price, quantity, and total price.
//        Use Constructor to intilize the attributes of class.
//        Now, in main method demonstrates the use of the CartItem class by creating instances of cart items,
//        adding them to a shopping cart, calculating the total price, and displaying the cart item details.

import java.util.Scanner;

public class CartManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = s.nextInt();
        s.nextLine();

        CartItem[] cart = new CartItem[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Product " + (i + 1) + " Details:");
            System.out.print("Product Name: ");
            String name = s.nextLine();

            System.out.print("Product Price: ");
            double price = s.nextDouble();
            s.nextLine();//gives extraa line ofspace

            System.out.print("Product Quantity: ");
            int quantity = s.nextInt();
            s.nextLine();

            cart[i] = new CartItem(name, price, quantity);
        }

        System.out.println("\nCart Details:");
        double totalCartPrice = 0;

        for (int i = 0; i < numProducts; i++) {
            System.out.println("\nProduct " + (i + 1) + " Information:");
            cart[i].displayCartItemDetails();
            totalCartPrice += cart[i].calculateTotalPrice();
        }

        System.out.println("\nTotal Cart Price: " + totalCartPrice);
    }
}

class CartItem {
    public String productName;
    public double price;
    public int quantity;

    public CartItem(String pn, double pr, int qu) {
        this.productName = pn;
        this.price = pr;
        this.quantity = qu;
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public void displayCartItemDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}