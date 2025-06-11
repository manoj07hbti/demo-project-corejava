package demo_arrays;

public class DemoArrays {
    public static void main(String[] args) {
        // We have 5 student name which we want to store
        String name1 = "Rahul";
        String name2 = "Rakesh";
        String name3 = "Mohit";
        String name4 = "Mukesh";
        String name5 = "Raj";

// Datatype varName [] = {value1, value2,value3.......valune N};
        String names[] = {"Rahul", "Rakesh", "Mohit", "Mukesh", "Raj"};

// how to read data from Array :   varName[INDEX]   names[0] => Rahul
        // System.out.println(names[4]);

        for (int i = 0; i < 5; i++) {
            System.out.println("Printing Array at Index: " + i + " " + names[i]);
        }
        //TODO do the same logic with while loop and do while loop...


        //SYNTAX    for (Datatype varName : arrayName){
        //                //CODE
        //             }

        for (String name : names) {

            System.out.println("Printing using Advance Loop: " + name);
        }



    }
}