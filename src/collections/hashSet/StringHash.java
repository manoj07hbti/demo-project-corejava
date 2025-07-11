package collections.hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringHash
{
    public HashSet<String> createStringData()
    {
        HashSet<String> string = new HashSet<>();

        string.add("Delhi");
        string.add("Mumbai");
        string.add("Pune");
        string.add("Agra");
        string.add("Delhi");
        string.add("Mumbai");
        string.add("Pune");
        string.add("Agra");

        return string;
    }


    public LinkedHashSet<String> createStringLinkedHashData()
    {
        LinkedHashSet <String> string = new LinkedHashSet<>();

        string.add("New Jersey");
        string.add("Washington");
        string.add("Florida");
        string.add("Nevada");
        string.add("New Jersey");
        string.add("Washington");
        string.add("Florida");
        string.add("Nevada");

        return string;
    }

    public static void main(String[] args)
    {
        StringHash stringHash = new StringHash();
        HashSet <String> output = stringHash.createStringData();
        System.out.println("Output: "+output);

        for (String var: stringHash.createStringLinkedHashData())
        {
            System.out.println("Output by enhanced for loop: "+var);
        }
    }
}
