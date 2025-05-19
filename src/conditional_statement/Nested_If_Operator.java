package conditional_statement;

public class Nested_If_Operator {
    public static void main(String[] args) {

        //Checking first division
        int marks=55;
         marks=32;
         marks=65;

        if(marks>=33){
            if(marks>=60){
                System.out.println("first division: " +marks);
            } else {
                System.out.println("not first division");
            }
        }

        //Odd or Even
        int number=1;
        number=2;
        if(number%2==0){
            System.out.println("number is even: " +number);
        } else {
            System.out.println("number is odd");
        }
    }
}
