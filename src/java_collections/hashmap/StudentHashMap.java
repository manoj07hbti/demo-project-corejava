package java_collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap {


    public HashMap<String, Integer> getStudentMarks() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> studentMarks = new HashMap<>();

        System.out.println("Enter student name and marks (type 'no' to stop):");

        while (true) {
            System.out.print("Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // consume newline

            studentMarks.put(name, marks);

            System.out.print("Add more? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        return studentMarks;
    }

    public static void main(String[] args) {
        StudentHashMap obj = new StudentHashMap();
        HashMap<String, Integer> result = obj.getStudentMarks();

        System.out.println("\nStudent Marks:");
        for (String name : result.keySet()) {
            System.out.println(name + " => " + result.get(name) + " marks");
        }
    }
}
