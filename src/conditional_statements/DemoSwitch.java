package conditional_statements;

public class DemoSwitch {

    public static void main(String[] args) {
        // Q-1 write code to check Day of a week based on number
        int number=9;

        switch (number){

            case 1:   // if(day==1)
                System.out.println("Monday...");
                break;
            case 2:
                System.out.println("Tuesday...");
                break;
            case 3:
                System.out.println("Wednesday...");
                break;
            case 4:
                System.out.println("Thursday...");
                break;
            case 5:
                System.out.println("Friday...");
                break;
            case 6:
                System.out.println("Saturday...");
                break;
            case 7:
                System.out.println("Sunday...");
                break;
            default:
                System.out.println("Invalid day passed...");

        }



    }
}
