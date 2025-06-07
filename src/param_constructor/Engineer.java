package param_constructor;

public class Engineer
{
    String name;
    int age;
    String field;

    public Engineer(String name, int age, String field)
    {
        this.name = name;
        this.age = age;
        this.field = field;
    }

    public static void main(String[] args)
    {
        Engineer engineerOne = new Engineer("Arthur",25,"CS");
        System.out.println("Engineer's Name: "+engineerOne.name+", Age: "+engineerOne.age+", Field: "+engineerOne.field);
        Engineer engineerTwo = new Engineer("John",23,"B.Tech");
        System.out.println("Engineer's Name: "+engineerTwo.name+", Age: "+engineerTwo.age+", Field: "+engineerTwo.field);
        Engineer engineerThree = new Engineer("Jack", 21,"B.Sc");
        System.out.println("Engineer's Name: "+engineerThree.name+", Age: "+engineerThree.age+", Field: "+engineerThree.field);
    }
}
