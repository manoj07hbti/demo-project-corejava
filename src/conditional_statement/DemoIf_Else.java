package conditional_statement;

public class DemoIf_Else {
    public static void main(String[] args) {

        int age=16;
        if(age>=18){
            System.out.println("Welcome to voting system");
        } else{
            System.out.println("You are not eligible for voting as your age is less than 18 year");
        }

        String city="jammu";
        if(city == "delhi"){
            System.out.println("he is from jammu");
        } else {
            System.out.println("hi is not from jammu");
        }

        double chair= 2350.25;
        if (chair>=2500){
            System.out.println("Chair is costly");
        } else {
            System.out.println("Chair is not costly");
        }

    }
}
