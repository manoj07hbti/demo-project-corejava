package arrays;

public class All_InOne_Employer_Height_Distance_Cont_Break {
    public static void main(String[] args) {

        //Here we are printing employer,height & distance all together using for,continue
        // & break loop
        String[] employer = {"Rohit", "Rahul", "Tikku", "Lakshay", "Gourav"};
        int[] distance = {234, 764, 525, 6775, 7643};
        double[] height={ 4.6 , 5.4 , 6.1 , 4.4 , 5.5 , 5.8 , 6.3 , 6.8 ,6.7 };

        //Here we are simply printing
        System.out.println(employer[4] + ":" +height[1] + " :- " + distance[3] );

        //Here we are usings loops
        for (int i = 0; i < 5; i++) {
            if (i == 1) {
                continue;
            }
            if ( i==4){
                break;
            }
            System.out.println(employer[i]  + " : " + height[i] + " = " + distance[i]);
        }
    }
}
