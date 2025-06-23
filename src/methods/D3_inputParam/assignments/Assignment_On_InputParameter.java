package methods.D3_inputParam.assignments;

public class Assignment_On_InputParameter {

    public void cube (int number ){
        int cube = number*number*number;
        System.out.println("cube of given number is: " + cube);

    }

    public void primeNumber ( int i){

        boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is composite number");
            }
        }




    public static void main(String[] args) {

        Assignment_On_InputParameter obj = new Assignment_On_InputParameter();

        obj.cube(3);
        obj.cube(76);
        obj.cube(11);


        obj.primeNumber(7);
        obj.primeNumber(9);
        obj.primeNumber(10);
        obj.primeNumber(13);
        obj.primeNumber(15);
        obj.primeNumber(11);
        obj.primeNumber(25);
        obj.primeNumber(16);



    }
















}
