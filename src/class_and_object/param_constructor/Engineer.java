package class_and_object.param_constructor;

public class Engineer {

    String name;
    String Degre;
    String company;
    int Salary;

    public Engineer(String name, String degre, String company, int salary) {
        this.name = name;
        Degre = degre;
        this.company = company;
        Salary = salary;
    }

    public static void main(String[] args) {


        Engineer OBJ1= new Engineer("Sahil","B.Tech "," CDS ",76400);

        System.out.println(OBJ1.name+OBJ1.Degre+OBJ1.company+OBJ1.Salary);

        Engineer OBJ2= new Engineer("pankaj ","B.Tech "," CTA ",89400);

        System.out.println(OBJ2.name+OBJ2.Degre+OBJ2.company+OBJ2.Salary);

    }


}
