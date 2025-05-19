package test_18_may;

public class AgeGp
{
    public static void main(String[] args)
    {
        int age = 55;

        if (age >= 0 && age <= 18)
        {
            System.out.println("Child..." + age);
        }
        if (age > 18 && age <= 40)
        {
            System.out.println("Young..." + age);
        }
        if (age >= 60)
        {
            System.out.println("Old age..."+age);
        }
    }
}
