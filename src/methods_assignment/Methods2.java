package methods_assignment;

public class Methods2 {

    public void even_And_Odd() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even numbers");
            } else {
                System.out.println(i + " is odd numbers");
            }
        }
    }


    public void primenumber(){


        for (int i = 1; i <= 20; i++) {
            boolean flag = true;
            if (i == 1) {
            }else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                System.out.println(i + " is prime number");
            } else {
                System.out.println(i + " not prime number");
            }
        }
    }

    public void percentage(){

        int number= 200;
        int percentage= 5;

        int result= (percentage*number/100);
        System.out.println(percentage+" % "+number+"= "+result);
    }


        public static void main (String[]args){

            Methods2 obj = new Methods2();
            obj.even_And_Odd();
            obj.primenumber();
            obj.percentage();

        }
    }

