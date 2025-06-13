package methods.input_param;

public class PercentageFinder
{
    public void percentageCheck(int total, int percentage)
    {
        int finalOutput = (total*percentage)/100;
        System.out.println("The final value is: "+finalOutput);
    }

    public static void main(String[] args)
    {
        PercentageFinder percentageFinder = new PercentageFinder();
        percentageFinder.percentageCheck(5000,10);
        percentageFinder.percentageCheck(700,20);
        percentageFinder.percentageCheck(2000,10);
    }
}
