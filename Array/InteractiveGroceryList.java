
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class InteractiveGroceryList {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;

        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {

            printActions();

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 ->
                    addItems(groceries);
                case 2 ->
                    removeItems(groceries);
                case 3 ->
                    clearItems(groceries);
                case 4 ->
                    viewItems(groceries);
                default ->
                    flag = false;

            }

            groceries.sort(Comparator.naturalOrder());
        }
    }

    private static void clearItems(ArrayList<String> groceryList) {

        if (!groceryList.isEmpty()) {
            groceryList.clear();
        }
        System.out.println("Your grocery list is emptied");
    }

    private static void addItems(ArrayList<String> groceryList) {

        System.out.println("Add Items seperated by commas");
        String input = scanner.nextLine();
        String[] inputtedArray = input.split(",");

        for (String grocery : inputtedArray) {
            String trimmedString = grocery.trim();
            if (groceryList.indexOf(trimmedString) < 0) {
                groceryList.add(trimmedString);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceryList) {

        System.out.println("Remove Items seperated by commas");
        String input = scanner.nextLine();
        String[] inputtedArray = input.split(",");

        for (String grocery : inputtedArray) {
            String trimmedString = grocery.trim();
            groceryList.remove(trimmedString);
        }
    }

    private static void viewItems(ArrayList<String> groceryList) {

        if (!groceryList.isEmpty()) {

            for (String e : groceryList) {
                System.out.println(e);
            }

        }else{
            System.out.println("No items is in the grocery list... please add the one");
        }

    }

    private static void printActions() {

        String textBlock
                = """

        Available actions:
        
        0 - to shutdown
        1 - to add item(s) to list (comma delimited list)
        2 - to remove any items (comma delimited list)
        3-  to clear the list
        4-  to view items in the list
        
        Enter a number for which action you want to do:
        
        """;

        System.out.println(textBlock + " ");
    }

}
