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


        //Reverse Pattern
        int row=6;
        for (int k=row;k>=1;k--){
            for (int l=1;l<=k;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Using Nested While Loop
        int a=1;
        while(a<=5){
            int b=1;
            while(b<=a){
                System.out.print("* ");
                b++;
            }
            System.out.println();
            a++;
        }

        //Using Nested do while
        int x=1;
        do{
            int y=1;
            do{
                System.out.print("* ");
                y++;
            }while(y<=x);
            System.out.println();
            x++;
        }while(x<=5);
    }
}
