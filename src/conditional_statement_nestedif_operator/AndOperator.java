package conditional_statement_nestedif_operator;

public class AndOperator {

    public static void main(String[] args) {

        // Write a code to check Eligibility Driving License
        String name= "Neeshu";
        int age =18;
        String city="Delhi";

        // True && True = True Condition
        if (age>=18 &&  city=="Delhi"){

                System.out.println("He is Eligible for Delhi Driving License..");
            }
            else {
                System.out.println("He is not Eligible for Delhi Driving License..");

            }

        // True && False = False Condition

        city="Agra";
        if (age>=18 &&  city=="Delhi"){

            System.out.println("He is Eligible for Delhi Driving License..");
        }
        else {
            System.out.println("He is not Eligible for Delhi Driving License..");

        }

        // False && True = False Condition

        age=16;
        if (age>=18 &&  city=="Delhi"){

            System.out.println("He is Eligible for Delhi Driving License..");
        }
        else {
            System.out.println("He is not Eligible for Delhi Driving License..");

        }


        // False && False = False Condition

        city="Agra";
        age= 17;
        if (age>=18 &&  city=="Delhi"){

            System.out.println("He is Eligible for Delhi Driving License..");
        }
        else {
            System.out.println("He is not Eligible for Delhi Driving License..");

        }

    }


}

