package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Customer_Hashmap {


    public HashMap<String,Long> CustomerData() {

        HashMap<String,Long> Customer_Data = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("please enter Customer Name");
            String CustomerName= scanner.nextLine();
            Customer_Data.get(CustomerName);
            System.out.println("Please Enter Customer Mobile Number");
            Long CustomerNumber = scanner.nextLong();
            Customer_Data.get(CustomerNumber);
            scanner.nextLine();
            Customer_Data.put(CustomerName, CustomerNumber);
            Scanner scanner1= new Scanner(System.in);
            System.out.println("you want to add more personage if yes then press key Z otherwise press any key to exit");
            String input = scanner1.nextLine();
            if (!input.equals("Z")) {
                flag = false;
            }
        }
        return Customer_Data;
    }

    public static void main(String[] args) {
        Customer_Hashmap obj= new Customer_Hashmap();
         HashMap<String,Long> output= obj.CustomerData();
        System.out.println("You entered your customer name and number as = "+output);
    }
}
