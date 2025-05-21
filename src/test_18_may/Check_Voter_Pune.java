package test_18_may;

public class Check_Voter_Pune {
    public static void main(String[] args) {
        String City = "Delhi";
        int Age = 17;
        if(City == "Pune"){
            if(Age>=18){
                System.out.println("You are Eligible for Voting in Pune.");
            }
            else{
                System.out.println("Your age is not fulfill criteria for voting in Pune.");
            }
        }
        else{
            System.out.println("You are not eligible for voting.");
        }
    }
}
