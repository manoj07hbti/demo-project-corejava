package test_16_june_commit;

public class Lowest_Element {

    //Problem: Write a Java method to find the Lowest element in an integer array.

    public void lowestElement(int []element){
       // int element []={12,46,8,9,45,9,1,-15};

        int min=element[0];

        for (int a=1;a< element.length;a++){

            if (min<element[a]){

            }else{
                min=element[a];
            }
        }
        System.out.println("Lowest element in the array is.."+min);
    }

    public static void main(String[] args) {
        int[] elements ={12,46,8,9,45,9,1,-15};

        Lowest_Element obj = new Lowest_Element();
        obj.lowestElement(elements);
    }
}
