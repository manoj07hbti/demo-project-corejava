package test_18_may;

public class RankingSystem
{
    public static void main(String[] args)
    {
        int percentage = 65;

        if (percentage >= 33 && percentage < 60)
        {
            System.out.println("Second division..."+percentage);
        }
        if (percentage >= 60 && percentage <= 75)
        {
            System.out.println("First division..."+percentage);
        }
        if (percentage > 75)
        {
            System.out.println("Gold medalist..."+percentage);
        }
        if (percentage < 33)
        {
            System.out.println("No such division..."+percentage);
        }
    }
}
