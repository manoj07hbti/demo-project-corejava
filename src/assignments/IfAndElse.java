package assignments;

public class IfAndElse {
    public static void main(String[] args) {

//Write a code if(marks >= 60)  first division
//else   not first division

        int marks =60;
        if (marks>=60){
            System.out.println("Congrats you achieve first division in this semester= ");
        }else{
            System.out.println("Sorry you not achieve first division in this semester");
        }

//Write a code if(marks< 33) : not cleared exam
//else: cleared exam

    if (marks>33){
        System.out.println("This semester you not cleared the exam= ");
    }else{
        System.out.println("This semester you cleared the exam");
    }


    }


}
