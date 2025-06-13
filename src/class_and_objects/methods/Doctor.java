package class_and_objects.methods;

public class Doctor {

    //create methods   :
    //surgery
    public void surgeryMethod(){
        System.out.println("printing surgery method");
    }

    //eat
    public void eatMethod(){
        System.out.println("printing eat method");
    }

    //sleep
    public void sleepMethod(){
        System.out.println("printing sleep method");
    }

    public static void main(String[] args) {
        Doctor obj1=new Doctor();
        obj1.surgeryMethod();
        obj1.eatMethod();
        obj1.sleepMethod();
    }
}
