package Hashmap;

import models.CTS_Data;
import java.util.ArrayList;
import java.util.HashMap;

public class CTS_Employee_List {

    public HashMap<String, ArrayList<CTS_Data>> Employees_List(){

        CTS_Data CTS1= new CTS_Data("varun","BCSL13",25000,3);
        CTS_Data CTS2= new CTS_Data("ayush","BCSL67",27000,4);
        CTS_Data CTS3= new CTS_Data("rahul","BCSL44",45000,5);
        CTS_Data CTS4= new CTS_Data("prerna","BCSL35",75000,7);
        CTS_Data CTS5= new CTS_Data("sahil","BCSL21",35000,4);


        ArrayList<CTS_Data> CTS_Data= new ArrayList<>();

        CTS_Data.add(CTS1);
        CTS_Data.add(CTS2);
        CTS_Data.add(CTS3);
        CTS_Data.add(CTS4);
        CTS_Data.add(CTS5);

        HashMap<String, ArrayList<CTS_Data>> map = new HashMap<>();
        map.put("EmployeeSheet", CTS_Data);

        return map;
    }

    public static void main(String[] args) {

        CTS_Employee_List obj= new CTS_Employee_List();
       HashMap <String,ArrayList<CTS_Data>> result= obj.Employees_List();
       for (String sheet: result.keySet()){

           ArrayList<CTS_Data> CTS_Data=result.get(sheet);
           System.out.println(CTS_Data);

           for (CTS_Data Result : CTS_Data)
               System.out.println("Name " + Result.getName() +" EmployeeId " + Result.getEmployeeId() + " Salary " + Result.getSalary() + " Experience " + Result.getExperience());
       }


    }

}
