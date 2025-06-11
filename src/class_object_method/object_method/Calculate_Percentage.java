package class_object_method.object_method;

public class Calculate_Percentage {

    // write a code to calculate percentage of given number


    public void calculatePercentage(){
        int number=150;
        double percentage= (double) (number*20)/100;

        System.out.println("Percentage of Given Number : "+percentage);

    }

    public static void main(String[] args) {
        Calculate_Percentage obj1=new Calculate_Percentage();
        obj1.calculatePercentage();
    }


}
