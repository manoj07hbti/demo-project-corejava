package test_8_june;

public class IIndLargest
{
    public void findingIIndLargest()
    {
        int values [] = {1,3,5,2,4};
        int IIndLargest = values[0];

        for (int i: values)
        {
            if (i > IIndLargest)
            {
                IIndLargest = i-1;
            }
        }
        System.out.println("IInd largest element is: "+IIndLargest);
    }

    public static void main(String[] args)
    {
        IIndLargest iIndLargest = new IIndLargest();
        iIndLargest.findingIIndLargest();
    }
}
