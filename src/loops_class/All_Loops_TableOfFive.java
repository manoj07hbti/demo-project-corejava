package loops_class;

public class All_Loops_TableOfFive {

    public static void main(String[] args) {
        // Write a code to Print Table of Five
        int num=5;
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+" = "+num*i);
        }

        // While Loop
        int j=1;
        while(j<=10){
            System.out.println(num+"*"+j+" = "+num*j);
            j++;
        }

        //Using Do while Loop
        /*do {
            // Code;
            //Increment/Decrement;
        } while (condition);*/
        int m=1;
        do{
            System.out.println("Using DO while Loop.."+num+"*"+m+" = "+num*m);
            m++;
        }while(m<=10);


    }
}
