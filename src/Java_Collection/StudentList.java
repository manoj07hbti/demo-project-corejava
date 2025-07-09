package Java_Collection;

import ClassAndObject.Param.Employee;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    public Student createStudent(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Subject: ");
        String subject = scanner.nextLine();
        System.out.println("Enter Class: ");
        int aClass = scanner.nextInt();

        Student student = new Student(name,age,subject,aClass);

        return student;
    }

    public static void main(String[] args) {
        ArrayList <Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        StudentList obj=new StudentList();
        boolean flag = true;
        while (flag==true){
            Student studentObj = obj.createStudent();
            studentList.add(studentObj);
            System.out.println("Do you want to add mode details press Y or any other key to exit: ");
            String choice = scanner.nextLine();
            if (!(choice.equals("Y"))){
                flag = false;
            }
        }

        for (Student var: studentList){
            System.out.println("Name: "+var.getName()+" Age: "+var.getAge()+ " Subject: "+var.getSubject()+" Class: "+var.getaClass());
        }

    }
}
