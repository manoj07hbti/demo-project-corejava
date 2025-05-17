package andopreator;

public class AndOpreator2 {

    public static void main(String[] args) {

// // True && True = True Condition

        String name="tarun";
        char section= 'A';

        if (name=="tarun" && section =='A'){
            System.out.println("He belongs to section= A");
        }else{
            System.out.println("He not belongs to section= A");
        }

// // True && False = False Condition

     section='B';

        if (name=="tarun" && section =='A'){
            System.out.println("He belongs to section= A");
        }else{
            System.out.println("He not belongs to section= A");
        }

//  // False && True = False Condition
        name="ayush";

        if (name=="tarun" && section =='A'){
            System.out.println("He belongs to section= A");
        }else{
            System.out.println("He not belongs to section= A");
        }

//  // False && False = False Condition

     name= "Rahul";
     section= 'C';

        if (name=="tarun" && section =='A'){
            System.out.println("He belongs to section= A");
        }else{
            System.out.println("He not belongs to section= A");
        }


    }

}
