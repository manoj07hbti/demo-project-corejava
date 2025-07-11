package collections.hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class IntHash
{
    public HashSet<Integer> createIntData()
    {
        HashSet<Integer> integer = new HashSet<>();

        integer.add(55);
        integer.add(65);
        integer.add(56);
        integer.add(66);
        integer.add(55);
        integer.add(65);
        integer.add(56);
        integer.add(66);

        return integer;
    }

    public LinkedHashSet<Integer> createIntLinkedHashData()
    {
        LinkedHashSet<Integer> integer = new LinkedHashSet<>();

        integer.add(11);
        integer.add(12);
        integer.add(21);
        integer.add(22);
        integer.add(11);
        integer.add(12);
        integer.add(21);
        integer.add(22);

        return integer;
    }

    public static void main(String[] args)
    {
        IntHash intHash = new IntHash();
        HashSet<Integer> output = intHash.createIntData();
        System.out.println("Output: "+output);

        for (Integer var: intHash.createIntLinkedHashData())
        {
            System.out.println("Output by enhanced for loop: "+var);
        }
    }
}
