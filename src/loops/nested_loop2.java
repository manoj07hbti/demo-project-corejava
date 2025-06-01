package loops;

import org.w3c.dom.ls.LSOutput;

public class nested_loop2 {
    public static void main(String[] args) {
        //table 2
        for (int i = 3; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.println("3*" +j +"= " +(i*j));
            }
            System.out.println();
        }
    }
}

