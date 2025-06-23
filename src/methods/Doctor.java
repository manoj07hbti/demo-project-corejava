package methods;

public class Doctor {

    String name;
    String hospital;
    String specialist;
    int salary;

    public void surgerymethod(){

        System.out.println("this is surgery method...");
    }

    public void eatmethod(){
        System.out.println("this is eat method...");
    }

    public void sleepmethod(){

        System.out.println("this is sleep method....");
    }

    public static void main(String[] args) {

        Doctor obj1= new Doctor();
        obj1.surgerymethod();
        obj1.eatmethod();
        obj1.sleepmethod();


    }

}
