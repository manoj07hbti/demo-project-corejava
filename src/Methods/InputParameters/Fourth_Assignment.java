package Methods.InputParameters;

public class Fourth_Assignment {
    public void Fact(int num){
        int res = 1;
        for(int i = num; i>0; i--){
            res *= i;
        }
        System.out.println("Factorial is "+res);
    }

    public static void main(String[] args) {
        Fourth_Assignment obj = new Fourth_Assignment();

        obj.Fact(3);
        obj.Fact(5);
        obj.Fact(9);
    }
}
