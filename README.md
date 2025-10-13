   import java.util.Scanner;

public class shopping {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] shoppingList = new String[5];
        int count = 0;

        System.out.println("Enter up to 5 items to buy:");
        
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.print("> ");
            String item = input.nextLine().trim();

              if (item.isEmpty()) {
                break;
            }

            shoppingList[i] = item;
            count++;
        }

        // This is shopping list
        System.out.println("\nYour shopping list:");
        for (int i = 0; i < count; i++) {
            System.out.print(shoppingList[i]);
            if (i < count - 1) System.out.print(", ");
        }

        System.out.println("\n\nYou entered " + count + " item" + (count > 1 ? "s." : "."));

           System.out.print("\nSearch for an item: ");
        String searchItem = input.nextLine().trim().toLowerCase();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (shoppingList[i].toLowerCase().equals(searchItem)) {
                found = true;
                break;
            }
        }
        
        // search item if found or not
        if (found) {
            System.out.println("✅ " + searchItem + " is in your shopping list!");
        } else {
            System.out.println("❌ " + searchItem + " is not in your shopping list.");
        }

        input.close();
    }
}
