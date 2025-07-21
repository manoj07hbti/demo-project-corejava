package collections.hashcodes;

import model.Engineer;

import java.util.HashSet;

public class EngineerHC
{
    public void createEngineers()
    {
        HashSet <Engineer> engineerHashSet = new HashSet<>();


        Engineer personOne = new Engineer("Max",50000,"Mechanical");
        System.out.println("Person One HashCode: "+personOne.hashCode());
        Engineer personTwo = new Engineer("Robert", 36000, "Software");
        System.out.println("Person Two HashCode: "+personTwo.hashCode());
        Engineer personThree = new Engineer("Trevor", 60000,"Civil");
        System.out.println("Person Three HashCode: "+personThree.hashCode());
        Engineer personFour = new Engineer("Max",50000,"Mechanical");
        System.out.println("Person Four HashCode: "+personFour.hashCode());
        Engineer personFive = new Engineer("Robert", 36000, "Software");
        System.out.println("Person Five HashCode: "+personFive.hashCode());

        engineerHashSet.add(personOne);
        engineerHashSet.add(personTwo);
        engineerHashSet.add(personThree);
        engineerHashSet.add(personFour);
        engineerHashSet.add(personFive);

        for (Engineer var: engineerHashSet)
        {
            System.out.println("Name: "+var.getName()+", Salary: "+var.getSalary()+", Specialization: "+var.getSpecialization());
        }
    }

    public static void main(String[] args)
    {
        EngineerHC engineerHC = new EngineerHC();
        engineerHC.createEngineers();
    }
}
