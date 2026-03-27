import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingCart {
  public static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean isFinished = false;

    while (!isFinished) {
      System.out.println("\n=== Shopping Cart ===");
      System.out.println("1. Enter an item\n2. Calculate total\n3. Display details\n4. Update Quantity\n0. Exit");
      int choice = input.nextInt();
      input.nextLine();

      if (choice == 1) {
        System.out.print("Product Name: ");
        String name = input.nextLine();

        System.out.print("Price: ");
        double price = input.nextDouble();

        System.out.print("Quantity: ");
        int qty = input.nextInt();
        input.nextLine();

        new Items(name, price, qty);
      }

      if (choice == 2) {
        getTotalPrice();
      }

      if (choice == 3) {
        displayItemDetails();
      }

      if (choice == 4) {
        System.out.print("Enter item name to update: ");
        String searchName = input.nextLine();

        boolean found = false;
        for (Items i : Items.allItems) {
          if (i.name.equalsIgnoreCase(searchName)) {
            System.out.print("Enter quantity to add: ");
            int addQty = input.nextInt();
            i.updateQuantity(addQty);
            found = true;
            break;
          }
        }
        if (!found)
          System.out.println("Item not found!");
      }

      if (choice == 0) {
        isFinished = true;
      }
    }
  }

  public static void getTotalPrice() {
    double total = 0;
    for (Items i : Items.allItems) {
      total += (i.price * i.quantity);
    }

    System.out.println("Total Price: PKR " + total);
  }

  public static void displayItemDetails() {
    for (Items i : Items.allItems) {
      System.out.println(i.name + " - Price: " + i.price + " | Qty: " + i.quantity);
    }
  }
}

class Items {
  String name;
  double price;
  int quantity;

  public static ArrayList<Items> allItems = new ArrayList<>();

  Items(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    allItems.add(this);
  }

  void updateQuantity(int amt) {
    this.quantity += amt;
  }
}
