package test_18_may;

public class Nationality_Check {
    // write a code to check person nationality , if nationality is India then check state should be Maharashtra then print both Nationality and state and if person is from different nation it should print that as well in else part.
    public static void main(String[] args) {
        String Nationality = "INDIA";
        String State = "DELHI";
        if (Nationality == "INDIA"){
            if (State == "MAHARASHTRA"){
                System.out.println("Person is from "+State+" in "+Nationality);
            }
            else {
                System.out.println("Person is belongs to "+Nationality+" but Lived in "+State);
            }
        }
        else{
            System.out.println("Person is from "+State+" in "+Nationality+". Not From INDIA");
        }
    }
}
