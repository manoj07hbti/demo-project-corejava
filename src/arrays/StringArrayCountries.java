package arrays;

public class StringArrayCountries {
    public static void main(String[] args) {

//    printing country names using for loop

        String countries[]={"india","usa","russia","japan","switzerland"};
       // System.out.println(country[2]);

        for (int i=0; i<=4; i++){
            System.out.println("printing country names= "+countries[i]);
        }
        System.out.println();

//  printing country names using while loop

        int i=0;
        while (i<=4){
            System.out.println("printing country names= "+countries[i]);
            i++;
        }
        System.out.println();
//  printing country names using do while loop

        int j=0;
        do {
            System.out.println("print country names= "+countries[j]);
            j++;
        }while (j<=4);
        System.out.println();

// print country names using advance loop

        for (String name:countries){
            System.out.println("printing country names= "+name);

        }

    }
}
