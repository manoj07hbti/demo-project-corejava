package class_object_method.method_input_parameter;

public class Class_InputPara_Day1 {

    //Use Input Parameter and call method 3 times with different data

    public void student(String name, int id, String section){

        System.out.println("Name : "+name+" ; Student Id : "+id+" ; Section : "+section);

    }


    // Calculator code
    public void add( int a, int b){

        int sum =a+b;

        System.out.println("sum of number....."+sum);

    }

    public void subtract( int a, int b){
            int subtraction= a-b;

        System.out.println("Subtraction of number.."+subtraction);
    }

    public void multiply( int a, int b){

        int c=a*b;

        System.out.println("Answer is .."+c);
    }

    public static void main(String[] args) {

        Class_InputPara_Day1 obj = new Class_InputPara_Day1();

        Class_InputPara_Day1 calc = new Class_InputPara_Day1();

        // call Student properties
        obj.student("Neeshu Bhadauriya",001,"Science");
        System.out.println("\t");
        obj.student("Zafar Imam",002,"Commerce");
        System.out.println("\t");
        obj.student("Tannu Sachdeva",003,"Arts");
        System.out.println("\t");
        obj.student("Teena Sachdeva",004,"Engineering");


        System.out.println("\t");
        // call calculator
        calc.add(56,98);
        calc.subtract(78,98);
        calc.multiply(78,98);

    }
}
