package array_practice;

public class CountryArray {
    public static void main(String[] args) {


        String country[]={"India","Usa","Australia","England","Russia"};
        //   System.out.println(country[2]);

// print country names for loop
        for (int i=0; i<=4; i++){
            System.out.println(country[i]);
        }
        System.out.println();

// // print country names while loop

        int i=0;
        while (i<=4){
            System.out.println(country[i]);
            i++;
        }
        System.out.println();

// print country names using Do While loop

        int j=0;
        do {
            System.out.println(country[j]);
            j++;
        }while (j<=4);
        System.out.println();

// print country names using advanced loop

        for (String counnames:country){
            System.out.println(counnames);
        }

    }
}
