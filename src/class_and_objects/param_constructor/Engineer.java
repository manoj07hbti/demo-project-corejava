package class_and_objects.param_constructor;

public class Engineer {

    // Properties of the data member
    String name;
    int age;
    int experience;
    long contactdetails;
    String qualification;

    public Engineer(String name, int age, int experience, long contactdetails, String qualification) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.contactdetails = contactdetails;
        this.qualification = qualification;
    }

    public static void main(String[] args) {
        Engineer obj1=new Engineer("aman",40,3,7007845001L,"B.Tech");
        System.out.println("name:"+obj1.name+","+"age:"+obj1.age+","+"experience:"+obj1.experience+"yrs,"+"contact no:"+obj1.contactdetails+","+"degree:"+obj1.qualification);

        Engineer obj2=new Engineer("rohit",35,4,7006732456L,"M.Tech");
        System.out.println("name:"+obj2.name+","+"age:"+obj2.age+","+"experience:"+obj2.experience+"yrs,"+"contact no:"+obj2.contactdetails+","+"degree:"+obj2.qualification);
    }
}
