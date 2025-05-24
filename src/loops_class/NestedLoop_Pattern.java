package loops_class;

public class NestedLoop_Pattern {
    public static void main(String[] args) {
        // Write a Code Print * Pattern
        //Using Nested for Loop
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
