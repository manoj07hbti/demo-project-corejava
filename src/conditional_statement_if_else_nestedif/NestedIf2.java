package conditional_statement_if_else_nestedif;

public class NestedIf2 {
    public static void main(String[] args) {
        //Find the tallest student among 2 students
        int n1 = 180, n2 = 150, n3 = 180;


        if (n1 >= n2) {
            if (n1 >= n3)
                System.out.println("Student with height " + n1 + " is the tallest");
            else {
                System.out.println("Student with height " + n3 + " is the tallest");
            }
        } else {
            if (n2 >= n3) {
                System.out.println("Student with height " + n2 + " is the tallest");
            } else {
                System.out.println("Student with height " + n3 + " is the tallest");
            }
        }


    }

}