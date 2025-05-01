package variable;

import java.text.DecimalFormat;

public class Test {


    public static void main(String[] args) {

        long number=35632231111123L;

        double output = number * 7.0 / 100;

        // Optional: format for clean decimal output
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("7% of " + number + " is: " + df.format(output));
    }


}
