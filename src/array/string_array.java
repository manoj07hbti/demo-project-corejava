package array;

public class string_array {
    public static void main(String[] args) {
        String name1 = "John";
        String name2 = "Jane";
        String name3 = "Rohit";
        String name4 = "Mohit";
        String name5 = "Sohan";
        String name6 = "Rohan";
        String name7 = "parvej";
        String name8 = "talim";

        String name[] = {"John", "Jane", "Rohit", "Mohit", "Sohan", "Rohan", "parvej", "talim"};


        System.out.println(name[4]);

        for (int i = 0; i < 8; i++) {
            System.out.println("printing name of the students..." + i + name[i]);

        }
      //  while
        int j=1;
        while ( j < 8) {

            System.out.println("printing name of the students..." + j + name[j]);

            j++;

        }
       // do while
        int k= 0;
        do {
            System.out.println("printing name of the students..." + k + name[k]);
            k++;
        } while ( k < 8);



    }
}
