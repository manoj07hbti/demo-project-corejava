package conditional_statement;

public class Not_Operator {
    public static void main(String[] args) {

        //write code to check country should not be indian

        String country="Pakistan";
        if(!(country=="India")){
            System.out.println("Country is not India: "+country);
        }else {
            System.out.println("Country is India");
        }
        //write code to check number is divisible by 5

        int number=15;
        if(!(number%5==0)){
            System.out.println("Number is not divisible by 5: "+ number);
        }else{
            System.out.println("Number is divisible by 5: "+number);
        }

        //write code to check is even or odd

        number=11;
        if(!(number%2==0)){
            System.out.println("Number is odd: "+number);
        }else{
            System.out.println("Number is even: "+number);
        }

    }
}
