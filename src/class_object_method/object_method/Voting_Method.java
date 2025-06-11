package class_object_method.object_method;

public class Voting_Method {

    //wrtie a method which can tell whether person is eligible for voting or not

    public void votingMethod(){

        int age=18;
        String city="Pune";

        if (age>=18 && city=="Delhi"){
            System.out.println("You are Eligible for voting in Delhi");
        }else {
            System.out.println("You are not Eligible for voting in Delhi, Because your age is 18");
        }

    }

    public static void main(String[] args) {

        Voting_Method obj1=new Voting_Method();
        obj1.votingMethod();
    }
}
