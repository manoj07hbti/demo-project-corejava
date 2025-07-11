package collections.hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DoubleHash
{
    public HashSet<Double> createDoubleData()
    {
        HashSet<Double> doubles = new HashSet<>();

        doubles.add(55.66);
        doubles.add(66.55);
        doubles.add(56.56);
        doubles.add(65.65);
        doubles.add(55.66);
        doubles.add(66.55);
        doubles.add(56.56);
        doubles.add(65.65);

        return doubles;
    }

    public LinkedHashSet<Double> createDoubleLinkedHashData()
    {
        LinkedHashSet<Double> doubles = new LinkedHashSet<>();

        doubles.add(77.88);
        doubles.add(88.77);
        doubles.add(78.78);
        doubles.add(87.87);
        doubles.add(77.88);
        doubles.add(88.77);
        doubles.add(78.78);
        doubles.add(87.87);

        return doubles;
    }

    public static void main(String[] args)
    {
        DoubleHash doubleHash = new DoubleHash();
        HashSet<Double> output = doubleHash.createDoubleData();
        System.out.println("Output: "+output);

        for (Double var: doubleHash.createDoubleLinkedHashData())
        {
            System.out.println("Output by using enhanced for loop: "+var);
        }
    }
}
