package class_and_objects;

public class Doctor {

    //Properties of the  data member
    String name="rohan";
    int age=40;
    String qualification="MBBS and Ph.D";
    String specialist="cardiologist";
    long contactnumber=7006583221L;

    public static void main(String[] args) {
        Doctor obj1=new Doctor();

        System.out.println("name:"+obj1.name+","+"age:"+obj1.age+","+"degree:"+obj1.qualification+","+"specialist:"+obj1.specialist+","+"contactnumber:"+obj1.contactnumber);

    }
}
