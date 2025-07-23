package Hashmap;

import models.DXC_Data;
import java.util.ArrayList;
import java.util.HashMap;

public class DXC_Employee_List {


    public HashMap<String, ArrayList<DXC_Data>> Employee_List(){

        DXC_Data DXC1= new DXC_Data("kavya","ACE256",31000,3);
        DXC_Data DXC2= new DXC_Data("ramesh","ACE347",16000,1);
        DXC_Data DXC3= new DXC_Data("tarun","ACE445",46000,5);
        DXC_Data DXC4= new DXC_Data("neeshu","ACE375",65000,7);
        DXC_Data DXC5= new DXC_Data("priya","ACE271",45000,4);


        ArrayList<DXC_Data> DXC_Data= new ArrayList<>();

        DXC_Data.add(DXC1);
        DXC_Data.add(DXC2);
        DXC_Data.add(DXC3);
        DXC_Data.add(DXC4);
        DXC_Data.add(DXC5);

        HashMap<String,ArrayList<DXC_Data>> Data= new HashMap<>();
        Data.put("Data",DXC_Data);

        return Data;

    }

    public static void main(String[] args) {

       DXC_Employee_List obj =new DXC_Employee_List();
        HashMap<String, ArrayList<DXC_Data>> result= obj.Employee_List();
        for (String value: result.keySet()){

            ArrayList<DXC_Data> IBM_Data=result.get(value);
            System.out.println(IBM_Data);

            for (DXC_Data Result : IBM_Data)
                System.out.println("Name " + Result.getName() +" EmployeeId " + Result.getEmployeeId() + " Salary " + Result.getSalary() + " Experience " + Result.getExperience());
        }

    }
}
