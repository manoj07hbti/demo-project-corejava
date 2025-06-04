package class_and_objects;

public class Engineer {

    // Properties of the data member

    String name="karan";
    int age =33;
    int experience=3;
    long contactdetails=9596563309L;
    String qualification="M.tech,B.tech";

    public static void main(String[] args) {
        Engineer obj1=new Engineer();

        System.out.println("name:"+obj1.name+","+"age:"+obj1.age+","+"experience:"+obj1.experience+"yrs,"+"contact no:"+obj1.contactdetails+","+"degree:"+obj1.qualification);
    }

}
