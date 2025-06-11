package class_object_method;

public class Prime_Number_Method {

    //write a method to check Prime number

    public void primeNumber(){

        for (int num=1;num<=50;num++) {
            boolean primeNumber = true;

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    primeNumber = false;
                } else {

                }
            }

            if (primeNumber) {
                System.out.println("Prime Number B/w 1 to 50 :- " + num);
            } else {
                // System.out.println("Number is Not..."+num);
            }
        }

    }

    public static void main(String[] args) {

        Prime_Number_Method obj1 = new Prime_Number_Method();
        obj1.primeNumber();
    }


}
