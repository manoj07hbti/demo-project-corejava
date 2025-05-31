package Loops;

public class LoopsAssignment {

    public static void main(String[] args) {
        /*
        String array country
        int array distance
        double array height
        while loop
        do while
        for loop
        advanced loop
         */

        String Name[] = {"Ram", "Shyam", "Harish", "Ramesh", "Suresh"};
        String Country[] = {"India", "USA", "France", "Germany", "New York"};
        int Distance[] = {500, 8000, 7000, 6600, 7300};
        double Height[] = {5.7, 5.9, 6.1, 5.4, 5.5};


        // Using for loop
        System.out.println("Using For Loop");
        for (int i = 0; i<5; i++){
            System.out.println("Student Name is "+Name[i]+" and He is from "+Country[i]+" and the distance is "+Distance[i]+ " Kilometer and his height is "+Height[i]);

        }

        // Using while loop
        System.out.println("Using While Loop");
        int j = 0;
        while (j<5){
            System.out.println("Student Name is "+Name[j]+" and He is from "+Country[j]+" and the distance is "+Distance[j]+ " Kilometer and his height is "+Height[j]);
            j++;
        }

        // Using Do while loop
        System.out.println("Using Do-While Loop");
        int k=0;
        do {
            System.out.println("Student Name is "+Name[k]+" and He is from "+Country[k]+" and the distance is "+Distance[k]+ " Kilometer and his height is "+Height[k]);
            k++;
        }while (k<5);


        // Using Advance Loop
        System.out.println("Using Advance Loop");
        for(String name: Name){
            System.out.println(name);
        }
        for (String country: Country){
            System.out.println(country);
        }
        for (int dist: Distance){
            System.out.println(dist);
        }
        for (double height: Height){
            System.out.println(height);
        }

    }
}
