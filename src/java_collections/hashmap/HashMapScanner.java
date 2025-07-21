package java_collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapScanner {

    // Method that takes user input and returns a HashMap
    public HashMap<String, Integer> createMapFromInput() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("You can keep adding entries. Type 'No' when you want to stop.\n");

        while (true) {
            System.out.print("Enter key (Course): ");
            String key = scanner.nextLine();

            System.out.print("Enter value (Duration(Day)): ");
            int value = scanner.nextInt();
            scanner.nextLine(); // consume newline

            map.put(key, value);

            System.out.print("Do you want to add another entry? (y/n): ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        return map;
    }


    public static void main(String[] args) {
        // Call the method and store the returned HashMap
        HashMapScanner obj = new HashMapScanner();

        HashMap<String, Integer> result =obj.createMapFromInput();
        System.out.println("\nYour HashMap entries are:" +result);
    }
}
