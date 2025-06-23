package methods;

public class Engineer {


    String name;
    String Degre;
    String company;
    int Salary;

    public void desginmethod() {

        System.out.println("this is desgin method...");
    }

    public void eatmethod() {

        System.out.println("this is eatmethod...");
    }

    public void sleepmethod() {

        System.out.println("this is sleepmethod....");
    }


    public static void main(String[] args) {

        Engineer OBJ1 = new Engineer();

        OBJ1.desginmethod();
        OBJ1.eatmethod();
        OBJ1.sleepmethod();


    }
}