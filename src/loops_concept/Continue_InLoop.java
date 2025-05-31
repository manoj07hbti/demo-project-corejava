package loops_concept;

public class Continue_InLoop {
    public static void main(String[] args) {


        //for(String name: names){
        // System.out.println("Printing using Advance Loop: "+name);
        for (int i = 0; i <= 4; i++) {
            if (i == 2) {
                continue;
            }System.out.println("continue example: " + i);
        }
    }
}