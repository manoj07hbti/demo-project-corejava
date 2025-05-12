package conditional_statement;

public class If_Result {
    public static void main(String[] args) {

        double marks=55.5;
        if(marks>=33){
            System.out.println("You have cleared the exam: " +marks);

               marks=32;
        if(marks<33){
            System.out.println("You have not cleared the exam: " +marks);
        }
        }
    }
}
