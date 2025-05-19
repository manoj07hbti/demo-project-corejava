package test_18_may;

public class NationalityCheck
{
    public static void main(String[] args)
    {
        String country = "India";
        String state = "Maharashtra";

        if (country == "India")
        {
            if (state == "Maharashtra")
            {
                System.out.println("Country: "+country+ ", State: "+state);
            }
            else
            {
                System.out.println("Value not valid...");
            }
        }
        else
        {
            System.out.println("Person belongs to the nationality of "+country);
        }
    }
}
