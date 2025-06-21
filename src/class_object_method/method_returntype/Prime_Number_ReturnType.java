package class_object_method.method_returntype;

public class Prime_Number_ReturnType {


    public boolean primeNumber(int a){


        for (int i=2;i*i<=a;i++){

            if (a % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Prime_Number_ReturnType obj= new Prime_Number_ReturnType();

        boolean output= obj.primeNumber(57);
        System.out.println("Given number is ..."+output);
    }
}
