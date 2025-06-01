package loops;

public class nested_loop1 {
    public static void main(String[] args) {
        //54321
        //4321
        //321
        //21
        //1

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(+j);
            }
            System.out.println();

        }

    }
}
