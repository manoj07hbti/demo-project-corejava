package Conditional_Statement;

/*
if candidate has marks greater than 33 then it will print cleared the exam.
if candidate has marks less than 33 then it will print NOT cleared the exam.
 */
public class Exam {
    public static void main(String[] args) {
        int Marks = 54;
        if(Marks >= 33){
            System.out.println("Cleared the exam");
        }
        if(Marks < 33){
            System.out.println("NOT cleared the exam");
        }
    }
}
