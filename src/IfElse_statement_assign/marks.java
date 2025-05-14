package IfElse_statement_assign;

public class marks {

    //if and else
    //	if(marks >= 60)  first division 	else   not first division
    //	 if(marks< 33) : not cleared exam  else: cleared exam

    public static void main(String[] args){
        int marks = 73 ;
        if(marks>= 60) {
            System.out.println("first devsion " + marks);

        }if(marks<33) {
            System.out.println("not cleared the exam " + marks);

        }else{
            System.out.println("cleared the exam " +marks);
        }

    }
}
