package class_and_objects.methods;

public class Engineer {
    //create methods : design
    // design
    public void designMethod(){
        System.out.println("printing design method");
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
        Engineer obj1=new Engineer();
        obj1.designMethod();
        obj1.eatMethod();
        obj1.sleepMethod();
    }
}
