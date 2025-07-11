package java_collections.list_generic;

import model.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.println("Please Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Please Enter Phone : ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Please Enter Department : ");
        String department = scanner.nextLine();

        Student student = new Student(studentId,name,phoneNumber,department);

        return student;

    }

    public static void main(String[] args) {

        // write a logic to call create employee data based on user choice and add to the List
        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        StudentList obj = new StudentList();

        boolean flag = true;
        while (flag == true) {
            Student studentObj =obj.createStudent(); // create variable for store value of the Method
            studentList.add(studentObj);
            System.out.println("Do you want add more Doctor ? press Y to continue or any other key to exit");
            String choice = scanner.nextLine();
            if (!choice.equals("Y")) {
                flag = false;
            }
            //  System.out.println(employeesList);
            for (Student var : studentList) {
                System.out.println("Student Id: "+var.getStudentId()+", Name: "+var.getName()+" Phone: "+var.getPhoneNumber()+", Department: "+var.getDepartment());
            }
        }
    }
}
