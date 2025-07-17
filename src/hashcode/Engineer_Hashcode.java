package hashcode;

import models.Engineer;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Engineer_Hashcode {

    public  void Engineer_Data(){

        LinkedHashSet<Engineer> EngineerHashcode= new LinkedHashSet<>();

        Engineer s1= new Engineer("Tarun",21,3 ,"CS");
        System.out.println( " Hashcode of S1 is "+s1.hashCode());
        Engineer s2= new Engineer("Tarun",21,3 ,"CS");
        System.out.println( " Hashcode of S2 is "+s2.hashCode());
        Engineer s3= new Engineer("jai",23,1 ,"IT");
        System.out.println( " Hashcode of S3 is "+s3.hashCode());
        Engineer s4= new Engineer("prince",25,4 ,"IT");
        System.out.println( " Hashcode of S4 is "+s4.hashCode());
        Engineer s5= new Engineer("ankit",27,3 ,"CS");
        System.out.println( " Hashcode of S5 is "+s5.hashCode());

        EngineerHashcode.add(s1);
        EngineerHashcode.add(s2);
        EngineerHashcode.add(s3);
        EngineerHashcode.add(s4);
        EngineerHashcode.add(s5);

        for (Engineer List: EngineerHashcode){
        System.out.println("Name= " + List.getName() +" Age= "+ List.getAge() + " Experience= "+ List.getExperience() + " Department= "+List.getDepartment());
        }
   }

    public static void main(String[] args) {

        Engineer_Hashcode obj= new Engineer_Hashcode();
        obj.Engineer_Data();
    }
}

