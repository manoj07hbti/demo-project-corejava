package loops_class;

public class Print_FiftyToTwenty {

    public static void main(String[] args) {
        //2- print value 50 to 25

        for (int i=50;i>=25;i--){
            System.out.println("Print Reverse 50 to 20.."+i);
        }

        // Using while Loop Here
        int j=25;
        while(j<=50){
            System.out.println("Print Reverse 50 to 20..Using While Loop.."+j);
            j++;
        }
    }
}
