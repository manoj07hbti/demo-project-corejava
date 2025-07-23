package java_collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class BookAuthorHashMap {


    public HashMap<String, String> getBooksData() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> books = new HashMap<>();

        System.out.println("Enter Book Title and Author (type 'no' to stop):");

        while (true) {
            System.out.print("Book Title: ");
            String title = scanner.nextLine();

            System.out.print("Author Name: ");
            String author = scanner.nextLine();

            books.put(title, author);

            System.out.print("Add another book? (y/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        return books;
    }


    public static void main(String[] args) {
        BookAuthorHashMap obj = new BookAuthorHashMap();
        HashMap<String, String> bookList = obj.getBooksData();

        System.out.println("All Book Author"+bookList);

        System.out.println("\nBooks and Authors:");
        for (String title : bookList.keySet()) {
            System.out.println("\"" + title + "\" by " + bookList.get(title));
        }
    }
}
