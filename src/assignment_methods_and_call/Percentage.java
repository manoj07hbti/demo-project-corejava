package assignment_methods_and_call;

public class Percentage {

    //write a code to calculate percentage of given number
    public void percentage(){
        double number=32;
        double total=75;
        double percentage= number/total*100;
        System.out.println("percentage======>"+percentage+"%");
    }

    public static void main(String[] args) {
        Percentage obj=new Percentage();
        obj.percentage();
    }
}
