package collections.list;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList
{
    public Student createStudent()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter student course:");
        String course = scanner.nextLine();

        Student student = new Student(name, age, course);

        return student;
    }

    public static void main(String[] args)
    {
        ArrayList <Student> studentArrayList = new ArrayList<>();
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag == true)
        {
            Student studentObj = studentList.createStudent();
            studentArrayList.add(studentObj);
            System.out.println("Press 'Y' to continue or any other key to exit:");
            String choice = scanner.nextLine();
            if (!(choice.equalsIgnoreCase("Y")))
            {
                flag = false;
            }
        }

        for (Student var: studentArrayList)
        {
            System.out.println("Student Name: " + var.getName() + ", Age: " + var.getAge() + ", Course: "+var.getCourse());
        }
    }
}
