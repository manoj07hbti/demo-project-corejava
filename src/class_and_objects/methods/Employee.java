package class_and_objects.methods;

public class Employee {

      //create methods :
      //work

    public void workMethod(){
        System.out.println("printing work method");
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
        Employee obj1=new Employee();
        obj1.workMethod();
        obj1.eatMethod();
        obj1.sleepMethod();
    }
}
