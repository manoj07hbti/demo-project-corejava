package polymorphism.methodoverloading;

public class Demo_Calculator_Method_Overloading {
   //Method Overloading
    //Method Overloading allows a class to have multiple methods with the same name but oiiuyuiiidifferent parameters or Arguments.

    // Add two integers
    public int add(int a, int b) {  // Parameter one int a , int b
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) { // Parameter two int a, int b and int c
        return a + b + c;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add one int and one double
    public double add(int a, double b) {
        return a + b;
    }



        public static void main(String[] args) {
            Demo_Calculator_Method_Overloading calc = new Demo_Calculator_Method_Overloading();


            System.out.println("Add (int, int): " + calc.add(10, 20));             // 30
            System.out.println("Add (int, int, int): " + calc.add(5, 15, 25));     // 45
            System.out.println("Add (double, double): " + calc.add(3.5, 2.5));     // 6.0
            System.out.println("Add (int, double): " + calc.add(10, 2.5));         // 12.5
        }

}
