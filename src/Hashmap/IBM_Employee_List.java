package Hashmap;

import models.IBM_Data;

import java.util.ArrayList;
import java.util.HashMap;

public class IBM_Employee_List {


    public HashMap<String, ArrayList<IBM_Data>> Employee_List(){

        IBM_Data IBM1= new IBM_Data("kunal","BCSE23",30000,3);
        IBM_Data IBM2= new IBM_Data("piyush","BCSE47",17000,1);
        IBM_Data IBM3= new IBM_Data("rahul","BCSE44",46000,5);
        IBM_Data IBM4= new IBM_Data("raj","BCSE35",55000,7);
        IBM_Data IBM5= new IBM_Data("sohil","BCSE21",35000,4);


        ArrayList<IBM_Data> IBM_Data= new ArrayList<>();

        IBM_Data.add(IBM1);
        IBM_Data.add(IBM2);
        IBM_Data.add(IBM3);
        IBM_Data.add(IBM4);
        IBM_Data.add(IBM5);

        HashMap<String,ArrayList<IBM_Data>> Data= new HashMap<>();
        Data.put("Data",IBM_Data);

        return Data;

    }

    public static void main(String[] args) {

        IBM_Employee_List obj=new IBM_Employee_List();
        HashMap <String,ArrayList<IBM_Data>> result= obj.Employee_List();
        for (String value: result.keySet()){

            ArrayList<IBM_Data> IBM_Data=result.get(value);
            System.out.println(IBM_Data);

            for (IBM_Data Result : IBM_Data)
                System.out.println("Name " + Result.getName() +" EmployeeId " + Result.getEmployeeId() + " Salary " + Result.getSalary() + " Experience " + Result.getExperience());
        }
    }
}