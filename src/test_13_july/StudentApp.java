package test_13_july;
import modal.Student1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

    public Student1 addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter name: ");
        String name=scanner.nextLine();
        System.out.println("Please enter rollNo: ");
        int age= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter marks : ");
        int marks= scanner.nextInt();
        System.out.println("Please enter branch : ");
        String branch= scanner.nextLine();
        String sc = scanner.nextLine();
        Student1 student= new Student1(name,age,marks,branch);

        return student;
    }
    public void printCSStudents(ArrayList<Student1> list) {
        System.out.println("\nStudents in CS branch:");
        for (Student1 s : list) {
            if (s.getBranch().equalsIgnoreCase("CS")) {
                System.out.println(s.getName() + " | Roll No: " + s.getRollNo());
            }
        }
    }

    // 2. Find student with highest and lowest marks
    public void printHighestAndLowestMarks(ArrayList<Student1> list) {
        if (list.isEmpty()) return;

        Student1 highest = list.get(0);
        Student1 lowest = list.get(0);

        for (Student1 s : list) {
            if (s.getMarks() > highest.getMarks()) highest = s;
            if (s.getMarks() < lowest.getMarks()) lowest = s;
        }

        System.out.println("\nHighest Marks: " + highest.getName() + " - " + highest.getMarks());
        System.out.println("Lowest Marks: " + lowest.getName() + " - " + lowest.getMarks());
    }

    // 3. Print all students between roll no 3 to 7
    public void printRollBetween3And7(ArrayList<Student1> list) {
        System.out.println("\nStudents with roll number between 3 and 7:");
        for (Student1 s : list) {
            if (s.getRollNo() >= 3 && s.getRollNo() <= 7) {
                System.out.println(s.getName() + " | Roll No: " + s.getRollNo());
            }
        }
    }

    // 4. Print students using while, do-while, enhanced loop
    public void printWithAllLoops(ArrayList<Student1> list) {
        System.out.println("\n--- Using while loop ---");
        int i = 0;
        while (i < list.size()) {
            Student1 s = list.get(i);
            System.out.println(s.getName() + " | " + s.getRollNo() + " | " + s.getMarks() + " | " + s.getBranch());
            i++;
        }

        System.out.println("\n--- Using do-while loop ---");
        int j = 0;
        if (!list.isEmpty()) {
            do {
                Student1 s = list.get(j);
                System.out.println(s.getName() + " | " + s.getRollNo() + " | " + s.getMarks() + " | " + s.getBranch());
                j++;
            } while (j < list.size());
        }

        System.out.println("\n--- Using enhanced for loop ---");
        for (Student1 s : list) {
            System.out.println(s.getName() + " | " + s.getRollNo() + " | " + s.getMarks() + " | " + s.getBranch());
        }
    }

    public static void main(String[] args) {
        ArrayList <Student1> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        StudentApp obj = new StudentApp();
        boolean flag = true;
        while (flag==true){
            Student1 studentObj = obj.addStudent();
            studentList.add(studentObj);
            System.out.println("Do you want to add more Students ? press y to continue or any other key to exit...");
            String choice = scanner.nextLine();
            if (!(choice.equals("y"))){
                flag=false;
            }

            obj.printCSStudents(studentList);               // 1
            obj.printHighestAndLowestMarks(studentList);    // 2
            obj.printRollBetween3And7(studentList);         // 3
            obj.printWithAllLoops(studentList);



        }

    }
}
