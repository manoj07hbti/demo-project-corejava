package array_practice;

public class String_Array_Country {

    public static void main(String[] args) {

        // Write a code to print country name with using Array

        String countries []={"India","Austria","Australia","Germany","UAE","London"};


        System.out.println("\t\tCity");
        System.out.println("---------------------");

        // Using For Loop
        for(int i=0;i<6;i++){
            System.out.println("Printing Countries "+i+" "+countries[i]);
        }

        // Using while Loop
        int j=0;
        System.out.println("Countries Name\t\t");
        System.out.println("=============================");

        while(j<6){
            System.out.println(countries[j]);
            j++;
        }

        //Using Advance for LOOP

        System.out.println("=============================");
        System.out.println("Countries Name\t\t");
        System.out.println("=============================");
        for (String country :countries){

            System.out.println(" Using Advance for Loop Print Country Name..."+country);

        }

    }

}
