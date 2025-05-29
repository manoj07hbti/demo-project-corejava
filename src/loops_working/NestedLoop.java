package loops_working;

public class NestedLoop {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++) {
                System.out.println("Hello This is normal loop: i-> " + i +" j : "+j );
            }
        }
       for (int k=1; k<=5; k++){

           for(int l=1; l<=k; l++){
                System.out.print(l);
            }
           System.out.println();
        }

    }
}
