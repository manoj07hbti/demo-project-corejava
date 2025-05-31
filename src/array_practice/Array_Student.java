package array_practice;

public class Array_Student {

    public static void main(String[] args) {
        // Write a program to Print class and Student Name Along with the Rollno who obtain 60%

        //int cls=10;

        String name []={"Neeshu","Zafar","Rahul","Tannu","Teena","Suraj","Sarvesh"};

        int rollNo[] ={1,15,45,32,3,5,3};

        for (int i=0;i<7;i++){
            System.out.println("Print Student Got 60% in Exam :- "+rollNo[i] + " - "+ name[i] + " ");
        }

    }
}
