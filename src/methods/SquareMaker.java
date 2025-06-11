package methods;

public class SquareMaker
{
    public void square()
    {
        int value = 6;
        int total = value*value;

        System.out.println("Square of the given number ("+ value +") is: "+total);
    }

    public static void main(String[] args)
    {
        SquareMaker squareMaker = new SquareMaker();
        squareMaker.square();
    }
}
