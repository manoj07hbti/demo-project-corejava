package assignment_methods_and_call;

public class VotingSystem {

    //write a method which can tell whether person is eligible for voting or not
    public void voting(){
        int age=11;
        if (age>18){
            System.out.println("welcome to voting system");
        }else {
            System.out.println("person is not eligible for voting");
        }
    }

    public static void main(String[] args) {
        VotingSystem obj1=new VotingSystem();
        obj1.voting();
    }

}
