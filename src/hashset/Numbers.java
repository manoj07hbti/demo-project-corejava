package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Numbers {

    public  HashSet<Integer> numbers(){

        HashSet<Integer>number= new HashSet<>();
        Scanner scanner =new Scanner(System.in);
        boolean flag =true;

        while (flag){

            System.out.println("please enter your number");
            Integer numbers=scanner.nextInt();
            number.add(numbers);
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Do you want to add more numbers if yes then press key A otherwise press any key to exit");
            String input =scanner1.nextLine();
            if (!input.equals("A")){
                flag=false;
            }
        }
        return number;
    }

    public static void main(String[] args) {

        Numbers obj=new Numbers();
       HashSet<Integer> output = obj.numbers();
       for (Integer value: output){
           System.out.println("you entered your numbers as= "+value);
       }
    }
}
