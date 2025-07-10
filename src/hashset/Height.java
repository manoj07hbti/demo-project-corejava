package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Height {

    public  HashSet<Double> personHeight(){

        HashSet<Double>height= new HashSet<>();
        Scanner scanner= new Scanner(System.in);
        boolean flag =true;

        while (flag){
            System.out.println("Please enter personHeight");
            Double Height= scanner.nextDouble();
            height.add(Height);
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Do you want to add more personHeights if yes then press key A otherwise press any key to exit");
            String choice= scanner1.nextLine();
            if (!choice.equals("A")){
                flag=false;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        Height obj=new Height();
       HashSet<Double> height= obj.personHeight();
       for (Double output: height){
           System.out.println("you entered your personHeight as= "+output);
       }
    }
}
