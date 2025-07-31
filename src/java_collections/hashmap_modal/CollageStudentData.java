package java_collections.hashmap_modal;

import model.Students;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CollageStudentData {

    //  method to input employee data for one department
    public HashSet<Students> addStudent(String collageName) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Students> studentSet = new HashSet<>();

        System.out.print("Enter number of employees for " + collageName + ": ");
        int empCount = scanner.nextInt();

        for (int i = 1; i <= empCount; i++) {
            System.out.println("Enter details for Student " + i + ":");
            System.out.print("Student Name: ");
            String name = scanner.next();

            System.out.print("Student Roll No: ");
            int rollNo = scanner.nextInt();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Marks: ");
            double marks = scanner.nextDouble();

            System.out.print("Branch: ");
            String branch = scanner.next();

            Students emp = new Students(name, rollNo,age,marks ,branch);
            studentSet.add(emp);
        }

        return studentSet;
    }

    public static void main(String[] args) {

        CollageStudentData obj = new CollageStudentData();
        // Input employee data college-wise

        HashSet<Students> collegeA = obj.addStudent("Delhi University");
        HashSet<Students> collegeB = obj.addStudent("Amity University");

        // Store colleges in a HashMap
        HashMap<String, HashSet<Students>> collegeData = new HashMap<>();
        collegeData.put("Delhi University", collegeA);
        collegeData.put("Amity University", collegeB);

        // Print all CS department employees college-wise
        System.out.println("\nPrinting CS Department Employees:");
        for (String college : collegeData.keySet()) {
            for (Students std : collegeData.get(college)) {
                if (std.getBranch().equalsIgnoreCase("Commerce")) {
                    System.out.println("From " + college + ": Name: " + std.getName() +
                            ", Age: " + std.getAge() + ", Department: " + std.getBranch());
                }
            }
        }


    }

}
