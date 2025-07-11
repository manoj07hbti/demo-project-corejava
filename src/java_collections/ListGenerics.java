package java_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListGenerics {

   // 1. String list : CountryName
   // 2. CountryPopulation : Long
    // 3.Salary : Double

    public ArrayList<String> CountryName(){
      boolean flag=true;
        Scanner Scanner= new Scanner(System.in);
        ArrayList<String>names=new ArrayList<>();
      while (flag){
          System.out.println("please enter country name :");
          String CountryName=Scanner.nextLine();
          names.add(CountryName);
          System.out.println("if you want to enter more country name then press A to continue or any other key to exit :");
          String choice=Scanner.nextLine();
          if (!(choice.equals("A")==true)){
              flag=false;
          }
      }


        return names;
    }

    // 2. CountryPopulation : Long

    public ArrayList<Long> CountryPop(){
        boolean flag=true;
        Scanner Scanner= new Scanner(System.in);
        ArrayList<Long>pop=new ArrayList<>();
        while (flag){
            System.out.println("please enter country population :");
            Long CountryPop=Scanner.nextLong();
            pop.add(CountryPop);
            System.out.println("if you want to enter more countries population then press A to continue or any other key to exit :");
            Long choice=Scanner.nextLong();
            Scanner Scanner1=new Scanner(System.in);
            if (!(choice.equals("A")==true)){
                flag=false;
            }
        }


        return pop;
    }

    // 3.Salary : Double

    public ArrayList<Double> Salary(){
        boolean flag=true;
        Scanner Scanner= new Scanner(System.in);
        ArrayList<Double>pay=new ArrayList<>();
        while (flag){
            System.out.println("please enter salary of employees :");
            Double Salary=Scanner.nextDouble();
            pay.add(Salary);
            System.out.println("if you want to enter more employees salary then press A to continue or any other key to exit :");
            Double choice=Scanner.nextDouble();
            Scanner Scanner2=new Scanner(System.in);
            if (!(choice.equals("A")==true)){
                flag=false;
            }
        }


        return pay;
    }


    public static void main(String[] args) {
        ListGenerics obj=new ListGenerics();
        ArrayList <String> output=obj.CountryName();
        System.out.println("you have enter the following country name in the list :"+output);


        System.out.println("list of countries population :"+obj.CountryPop());
        System.out.println("list of employees salary :"+obj.Salary());

    }
}
