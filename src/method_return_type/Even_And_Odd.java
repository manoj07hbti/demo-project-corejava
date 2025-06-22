package method_return_type;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Even_And_Odd  {

    public String even_And_Odd(int number) {

        if (number%2==0){
            return "Even";
        }else {
            return "Odd";
        }

    }
    public static void main(String[] args) {
        Even_And_Odd obj= new Even_And_Odd();
        int num=7;
        String result= obj.even_And_Odd(num);
        System.out.println(num+" is "+ result);

        num =4;
        result = obj.even_And_Odd(num);
        System.out.println(num +" is "+ result);

        num =13;
        result = obj.even_And_Odd(num);
        System.out.println(num +" is "+ result);

        num =20;
        result = obj.even_And_Odd(num);
        System.out.println(num +" is "+ result);
    }
}


