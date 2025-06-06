package class_and_objects.param_constructor;

public class Doctor {

    //Properties of the  data member
    String name;
    int age;
    String qualification;
    String specialist;
    long contactnumber;

    public Doctor(String name, int age, String qualification, String specialist, long contactnumber) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.specialist = specialist;
        this.contactnumber = contactnumber;
    }

    public static void main(String[] args) {
        Doctor obj1= new Doctor("aman",43,"MBBS","Cardilogist",9906056823L);
        System.out.println("name:"+obj1.name+","+"age:"+obj1.age+","+"degree:"+obj1.qualification+","+"specialist:"+obj1.specialist+","+"contactnumber:"+obj1.contactnumber);

        Doctor obj2=new Doctor("rohan",32,"Ph.D","skin",6006743709L);
        System.out.println("name:"+obj2.name+","+"age:"+obj2.age+","+"degree:"+obj2.qualification+","+"specialist:"+obj2.specialist+","+"contactnumber:"+obj2.contactnumber);


    }

}
