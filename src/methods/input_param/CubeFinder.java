package methods.input_param;

public class CubeFinder
{
    public void cubeCalculate(int value)
    {
        int sum = value*value*value;
        System.out.println("Cube of "+ value +" is: "+sum);
    }

    public static void main(String[] args)
    {
        CubeFinder cubeFinder = new CubeFinder();
        cubeFinder.cubeCalculate(2);
        cubeFinder.cubeCalculate(6);
        cubeFinder.cubeCalculate(3);
    }
}
