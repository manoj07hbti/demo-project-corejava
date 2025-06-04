package class_and_object;

public class Engineer
{
    String name = "Harry";
    String skill = "Bug Solving";
    String language = "Java";
    int salary = 1200000;
    int groupNumber = 7;

    public static void main(String[] args)
    {
        Engineer engineer = new Engineer();

        System.out.println("Name: "+engineer.name);
        System.out.println("Skill: "+engineer.skill);
        System.out.println("Language: "+engineer.language);
        System.out.println("Salary: "+engineer.salary);
        System.out.println("Group Number: "+engineer.groupNumber);
    }
}
