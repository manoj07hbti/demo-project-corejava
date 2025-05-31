package loops_class;

import test_18_may.CheckVoterEligibility;

public class Loop_Break {

    public static void main(String[] args) {

        double height []= {1.4,15.2,45.3,32.4,3.5,5.3,3.4};

        // we need Print till index 3
        for (int i=0;i<=10;i++) {
            if (i==3) {
                break;
            }
            System.out.println("Printing  till index...3 "+ height[i]);
        }
    }
}
