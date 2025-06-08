package class_and_object;

public class Engineer {

    String name="Sahil";
    String Degre="Civil";
    String company="MSS Constructions";
    int Salary=35000;

    public void desginmethod(){

        System.out.println("this is desgin method...");
    }

    public void eatmethod(){

        System.out.println("this is eatmethod...");
    }

    public void sleepmethod(){

        System.out.println("this is sleepmethod....");
    }


    public static void main(String[] args) {

        Engineer OBJ1= new Engineer();

        System.out.println("Name : "+OBJ1.name+", Degre : "+OBJ1.Degre+", company : "
                +OBJ1.company +", Salary : "+OBJ1.Salary);

    }


}
