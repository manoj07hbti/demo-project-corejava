package methods;

public class PercentageFinder
{
    public void percentageFinder()
    {
        int maxNumber = 500; int percentage = 10;
        int total = (maxNumber * percentage) / 100;

        System.out.println("The total percentage is: "+ total);
    }

    public static void main(String[] args)
    {
        PercentageFinder percentageFinder = new PercentageFinder();
        percentageFinder.percentageFinder();
    }
}
