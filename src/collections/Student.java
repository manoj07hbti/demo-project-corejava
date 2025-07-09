package collections;

import models.StudentList;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    public StudentList student(){

        Scanner Scanner= new Scanner(System.in);
        System.out.println("Please enter name ");
        String name= Scanner.nextLine();
        System.out.println("Please enter studentId");
        String studentID= Scanner.nextLine();
        System.out.println("Please enter age");
        int age= Scanner.nextInt();
        System.out.println("Please enter rollNo ");
        int rollNo = Scanner.nextInt();

        StudentList student = new StudentList(name,studentID,age,rollNo);

        return student;

    }

    public static void main(String[] args) {

        ArrayList<StudentList>Studentlist= new ArrayList<>();
        Scanner Scanner =new Scanner(System.in);
        Student obj =new Student();

        boolean flag= true;
        while (flag==true){
        StudentList studentlist= obj.student();
        Studentlist.add(studentlist);
            System.out.println("Do you want to add more Student if yes then press Z otherwise press any key to exit");
            String choice= Scanner.nextLine();
            if (!choice.equals("Z")==true) {
                flag=false;

            }
        }

        for (StudentList list: Studentlist){
            System.out.println("Name= "+list.getName() +" StudentID= "+list.getStudentId() +" Age= "+list.getAge() +" rollNo= "+list.getRollNo());
        }
    }

}
