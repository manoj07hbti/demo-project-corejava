package methods.scanner;

import java.util.Scanner;

public class CalculatorApp {

    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
    public int multi(int a , int b){
        return a*b;
    }
    public double divide(int a , int b){
        return (double) a/b;
    }

    public static void main(String[] args) {

        String flag="Y";
        Scanner obj =new Scanner(System.in);
        CalculatorApp cal=new CalculatorApp();
        while (flag.equals("Y")){

            System.out.println("Please enter value of a: ");
            int a=obj.nextInt();
            System.out.println("Please enter value of b: ");
            int b=obj.nextInt();
            System.out.println("Please enter choice , 1-Add, 2- Sub , 3- Multi, 4 divide ");
            int choice=obj.nextInt();
            if(choice==1){
                System.out.println("Addition of given number is : "+cal.add(a,b));
            }
            if(choice==2){
                System.out.println("Addition of given number is : "+cal.sub(a,b));
            }
            if(choice==3){
                System.out.println("Addition of given number is : "+cal.multi(a,b));
            }
            if(choice==4){
                System.out.println("Addition of given number is : "+cal.divide(a,b));
            }

            Scanner obj2 =new Scanner(System.in);
            System.out.println("Press Y to continue or press any other key to exit");
            flag=obj2.nextLine();
          if(!flag.equals("Y")){
              System.out.println("Exiting .....Thanks for Using Calculator App...");
              break;
          }

        }




    }
}
