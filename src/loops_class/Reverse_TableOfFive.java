package loops_class;

public class Reverse_TableOfFive {

    public static void main(String[] args) {
        // Write a code to Print Table of Five
        int num=5;
        for(int i=10;i>=1;i--){
            System.out.println(num+"*"+i+" = "+num*i);
        }

        // While Loop
        int j=10;
        while(j>=1){
            System.out.println(num+"*"+j+" = "+num*j);
            j--;
        }


    }

}
