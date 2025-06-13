package class_object_method.method_input_parameter;

import javax.swing.*;

public class Percentage_Method_InParameter {

    //calculate percentage : number, % : 5000 10%

    public void percentage(int num){
        int percentage = (num/100)*10;

        System.out.println("10% of 5000 is...."+percentage);
    }


    public static void main(String[] args) {

        Percentage_Method_InParameter obj1 = new Percentage_Method_InParameter();

        obj1.percentage(5000);
    }
}
