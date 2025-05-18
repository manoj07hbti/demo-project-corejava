package test_18_may;

public class CheckVoterEligibility {

    public static void main(String[] args) {

        //write a code to check eligible voter in Pune

        int age=19;
        String name= "Neeshu";
        String cityName="Pune";

        if (age>=18 && cityName=="Pune") {
            System.out.println(name+ " is Eligible for voting in Pune");
        }else{
            System.out.println(name+ " is not Eligible for voting in Pune..Because he is from "+cityName);
        }
    }
}
