package test_13_July;


import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

    // 1. Creating a method which will create a list of students.
    public Student AddStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll No. : ");
        int roll_no = scanner.nextInt();
        System.out.print("Enter Marks out of 500 : ");
        double marks = scanner.nextInt();
        System.out.print("Enter Branch Name : ");
        String branch = scanner.nextLine();
        branch = scanner.next();


        Student student = new Student(name, roll_no, marks, branch);

        return student;
    }

    public static void main(String[] args) {

        ArrayList<Student> student_data = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Creating obj
        Test1 obj = new Test1();
        System.out.println("Enter 1 student data.");
        for (int i = 1; i<=10; i++){
            // calling object
            Student std_obj = obj.AddStudent();
            student_data.add(std_obj);
            System.out.println("Enter "+(i+1)+" student data.");
        }

        // 2. Print student data for CS branch.
        System.out.println("----------------------------------------------------------------");
        System.out.println("Student data for CS Branch.");
        for (Student var : student_data){
            if (var.getBranch().equals("CS")){
                System.out.println("Name : "+var.getName()+" Roll No. : "+var.getRoll_no()+" Marks : "+var.getMarks()+" Branch : "+var.getBranch());
            }
        }


        // 3. Print Highest and Lowest student data.
        System.out.println("----------------------------------------------------------------");
        System.out.println("Student data of Highest and lowest marks.");
        Student highest = student_data.get(0);
        Student lowest = student_data.get(0);

        for (Student var : student_data){
            if (var.getMarks() > highest.getMarks()){
                highest = var;
            } else if (var.getMarks() < lowest.getMarks()) {
                lowest = var;
            }
        }

        System.out.println("\nStudent with Highest Marks : ");
        System.out.println("Name: "+highest.getName()+" Roll No. : "+highest.getRoll_no()+" Marks: "+highest.getMarks()+" Branch: "+highest.getBranch());
        System.out.println("\nStudent with Lowest Marks : ");
        System.out.println("Name: "+lowest.getName()+" Roll No. : "+lowest.getRoll_no()+" Marks: "+lowest.getMarks()+" Branch: "+lowest.getBranch());


        // 4. Print Student data between roll no. 3 to 7
        System.out.println("----------------------------------------------------------------");
        System.out.println("Student data between roll no. 3 to 7");

        for (Student var : student_data){
            if (var.getRoll_no() >=3 && var.getRoll_no()<=7){
                System.out.println("Name : "+var.getName()+" Roll No. : "+var.getRoll_no()+" Marks : "+var.getMarks()+" Branch : "+var.getBranch());
            }
        }

        // 5. Print all data using while loop
        System.out.println("----------------------------------------------------------------");
        System.out.println("Printing Student data using while loop.");
        int i = 0;
        while (i < student_data.size()){
            Student var = student_data.get(i);
            System.out.println("Name : "+var.getName()+" Roll No. : "+var.getRoll_no()+" Marks : "+var.getMarks()+" Branch : "+var.getBranch());
            i++;
        }

        // 5. Print all data using do-while loop
        System.out.println("----------------------------------------------------------------");
        System.out.println("Printing Student data using while loop.");
        int j = 0;
        do {
            Student var = student_data.get(j);
            System.out.println("Name : "+var.getName()+" Roll No. : "+var.getRoll_no()+" Marks : "+var.getMarks()+" Branch : "+var.getBranch());
            j++;
        }while (j<student_data.size());

        // 5. Print all data using Advanced loop
        System.out.println("----------------------------------------------------------------");
        System.out.println("Printing Student data using advance loop.");
        for (Student var : student_data){
            System.out.println("Name : "+var.getName()+" Roll No. : "+var.getRoll_no()+" Marks : "+var.getMarks()+" Branch : "+var.getBranch());
        }
    }
}
