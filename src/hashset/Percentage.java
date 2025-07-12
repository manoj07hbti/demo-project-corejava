package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Percentage {

    public  HashSet<Double> percentage(){

        HashSet<Double>percent= new HashSet<>();
        Scanner scanner =new Scanner(System.in);
        boolean flag =true;

        while (flag){
            System.out.println("please enter percentage");
            Double Percent= scanner.nextDouble();
            percent.add(Percent);
            System.out.println("do you want to add more percentage if yes then press key Z otherwise press any key to exit");
            Scanner scanner1= new Scanner(System.in);
            String choice= scanner1.nextLine();
            if (!choice.equals("Z")){
                flag=false;
            }

        }
        return percent;
    }

    public static void main(String[] args) {

        Percentage obj=new Percentage();
        HashSet<Double> output = obj.percentage();
        for (Double percent: output)
            System.out.println("you entered your percentage as= "+percent);


    }

}
