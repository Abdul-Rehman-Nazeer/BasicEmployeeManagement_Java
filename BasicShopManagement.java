//        A shopkeeper wants to maintain records for the items in his shop.
//        1. Create a class named as Item.
//        2. Public Member variables: Item name, Item ID Private Member Variables: Price,
//        Stock
//        3. Create Accessor and Mutator for the private member variables.
//        4. A user will be able to search for items that the user wants to purchase. The price will
//        be displayed for that particular item. Use set function to set the price of an item.
//        5. Set the items in stock using set function. If the user tries to purchase more items
//        than present in the stock, then display a message that cannot purchase more items
//        than available in stock. Display the total bill for the items purchased.

import java.util.Scanner;

public class BasicShopManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Item[] arr = new Item[3]; // Assuming shop have 3 items

        arr[0] = new Item("Rice", 99, 300, 500);
        arr[1] = new Item("Egg", 12, 30, 100);
        arr[2] = new Item("Soap", 5, 75.49, 25);

        System.out.println("Available Items:");
        for (Item item : arr) {
            System.out.println(item.getItemID() + ": " + item.getItemName() + " - $" + item.getItemPrice());
        }

        System.out.print("Enter the name of the product you want to purchase: ");
        String selectedProductName = s.nextLine();

        Item selectedItem = null;
        for (Item item : arr) {
            if (item != null && item.getItemName().equalsIgnoreCase(selectedProductName)) {//ignoring upper/lowercase
                selectedItem = item;
                break;
            }
        }

        if (selectedItem != null) {
            System.out.print("Enter the quantity you want to purchase: ");
            int quantityToPurchase = s.nextInt();

            if (quantityToPurchase <= selectedItem.getStock()) {
                double totalPrice = selectedItem.calculateTotalPrice(quantityToPurchase);
                System.out.println("Item Name: " + selectedItem.getItemName());
                System.out.println("Item Price: $" + selectedItem.getItemPrice());
                System.out.println("Quantity to Purchase: " + quantityToPurchase);
                System.out.println("Total Price: $" + totalPrice);

                selectedItem.setStock(selectedItem.getStock() - quantityToPurchase);
                System.out.println("Stock remaining: " + selectedItem.getStock());
            } else {
                System.out.println("Cannot purchase more items than available in stock.");
            }
        } else {
            System.out.println("Product not found.");
        }
    }
}
class Item {
    private String itemName;
    private int itemID;
    private double price;
    private int stock;
    public Item(String itemName, int itemID, double price, int stock) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.price = price;
        this.stock = stock;
    }
    public double getItemPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public String getItemName() {
        return itemName;
    }
    public int getItemID() {
        return itemID;
    }
    public void setItemPrice(double price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double calculateTotalPrice(int quantity) {
        return price * quantity;
    }
}