package Hashmap;

import models.StudentList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CollageStudent {

    public HashMap<String, HashSet<StudentList>> students() {

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);


        HashSet<StudentList> CollageStudentA = new HashSet<>();
        HashSet<StudentList> CollageStudentB = new HashSet<>();

        while (flag) {
            System.out.println("Enter CollageStudentsA Details ( name, StudentId, Age, RollNo):");
            System.out.println("Enter Student Name:");
            String name= scanner.nextLine();
            System.out.println("Enter StudentID");
            String studentId =scanner.nextLine();
            System.out.println("Enter Student Age");
            int age =scanner.nextInt();
            System.out.println("Enter Student RollNo");
            int rollNo =scanner.nextInt();
               scanner.nextLine();

                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Do You Want To Add More Students? (Press 1 to Continue, Any Other Key to Exit)");
                String input = scanner1.nextLine();
                if (!input.equals("1")) {
                    flag =false;
                    CollageStudentA.add(new StudentList(name ,studentId ,age, rollNo));

                }

                flag= true;
                while (flag) {

                    System.out.println("Enter CollageStudentsB Details (StudentId, Age, RollNo):");
                    System.out.println("Enter Student Name:");
                    String Name= scanner.nextLine();
                    System.out.println("Enter StudentID");
                    String studentID =scanner.nextLine();
                    System.out.println("Enter Student Age");
                    int Age =scanner.nextInt();
                    System.out.println("Enter Student RollNo");
                    int RollNo =scanner.nextInt();
                    scanner.nextLine();

                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Do You Want To Add More Students? (Press 1 to Continue, Any Other Key to Exit)");
                        String Input = scanner2.nextLine();
                        if (!Input.equals("1")) {
                            flag = false;
                            CollageStudentA.add(new StudentList(Name ,studentID, Age, RollNo));

                        }
                    }
                }

        HashMap<String, HashSet<StudentList>> collegeData = new HashMap<>();
        collegeData.put("A", CollageStudentA);
        collegeData.put("B", CollageStudentB);


        return collegeData;

    }

    public static void main(String[] args) {

        CollageStudent obj = new CollageStudent();
        HashMap<String, HashSet<StudentList>> collegeData= obj.students();

        for(String key: collegeData.keySet()){
            for(StudentList var : collegeData.get(key)){
                System.out.println("name= "+var.getName()+ " StudentId= " + var.getStudentId()+ " Age= "+ var.getAge() +" StudentRollNo= "+ var.getRollNo());
            }
        }
    }
    }




