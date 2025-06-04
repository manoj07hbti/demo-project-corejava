package ClassAndObject;

public class Engineer {
    String Name = "Pavan";
    int Age = 32;
    String Branch = "Mechanical Engineer";

    public static void main(String[] args) {
        Engineer Eng1 = new Engineer();
        Engineer Eng2 = new Engineer();
        Engineer Eng3 = new Engineer();
        Engineer Eng4 = new Engineer();
        Engineer Eng5 = new Engineer();

        System.out.println(Eng1.Name+" is "+Eng1.Age+" Years old and He is a "+Eng1.Branch);
        System.out.println(Eng2.Name+" is "+Eng2.Age+" Years old and He is a "+Eng2.Branch);
        System.out.println(Eng3.Name+" is "+Eng3.Age+" Years old and He is a "+Eng3.Branch);
        System.out.println(Eng4.Name+" is "+Eng4.Age+" Years old and He is a "+Eng4.Branch);
        System.out.println(Eng5.Name+" is "+Eng5.Age+" Years old and He is a "+Eng5.Branch);
    }
}
