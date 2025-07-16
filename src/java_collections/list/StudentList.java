package java_collections.list;

import modal.Student;

import java.util.ArrayList;
import java.util.Scanner;
public class
StudentList {

    public Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name: ");
        String name=scanner.nextLine();
        System.out.println("Please enter Age: ");
        int age= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter section : ");
        String section= scanner.nextLine();
        Student student= new Student(name,age,section);

        return student;
    }


    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        StudentList obj = new StudentList();
        boolean flag = true;
        while (flag==true) {
            Student studentObj = obj.createStudent();
            studentList.add(studentObj);
            System.out.println("Do you want to add more Students ? press y to continue or any other key to exit...");
            String choice = scanner.nextLine();
            if (!(choice.equals("y"))) {
                flag = false;
            }
        }

//        for (Student var: studentList){
//            System.out.println(var.getName()+" " + var.getAge()+ " "+ var.getSection());
//    }

            for (int i=0; i<studentList.size(); i++){
                Student s = studentList.get(i);
                System.out.println(s.getName() + " " + s.getAge() + " " + s.getSection());

        }
    }
}
