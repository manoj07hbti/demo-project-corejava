package conditional_statement;

public class If_Operator {
    public static void main(String[] args) {

        //whether batsman made century or not
        int run=112;
        if (run>=100){
            System.out.println("batsman made his century>=100: " +run);

            run=88;
        if (run<100){
            System.out.println("batsman can not made his century<100: " +run);
        }
        }

        // Checking driving licence age
        int age=20;
        if (age>=18){
            System.out.println("person is eligible for driving licence>=18: " +age);

            age=15;
            if (age<18){
                System.out.println("person is not eligible for driving licence<18: " +age);
            }
        }

        //Nationality
        String nation="Indian";
        if(nation=="Indian"){
            System.out.println("Indian");
        }

        nation="pakistan";
        if(nation!="india");{
            System.out.println("Non indian");
        }

        //Result declaration
        double marks=55.5;
        if(marks>=33){
            System.out.println("You have cleared the exam: " +marks);

            marks=32;
            if(marks<33){
                System.out.println("You have not cleared the exam: " +marks);
            }
        }

        //verifying Department
        String department="science";
        if(department=="science") {
            System.out.println("science department ");

            department = "math";
            if(department=="science"){
                System.out.println("not science department");
            }
        }

        //Cheking age for voting
         age=21;
        if(age>=18){
            System.out.println("Welcome to voting system: " +age);

            age=17;
            if(age<18){
                System.out.println("You are not elligible for voting as your age is less than 18 year: "+age);

            }
        }

    }
}
