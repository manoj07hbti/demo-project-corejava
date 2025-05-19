package test_18_may;

public class PercentageCheck
{
    public static void main(String[] args)
    {
        int percentage = 5;
        int totalValue = 500;

        int sum = percentage*totalValue;
        double totalPercentage = (double) sum/100;
        System.out.println("Total percentage: " + totalPercentage);
    }
}
