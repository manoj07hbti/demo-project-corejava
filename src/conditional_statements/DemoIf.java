package conditional_statements;

public class DemoIf {
    public static void main(String[] args) {

//Question 1
        int age1=20;
        if(age1>18) {
            System.out.println("Person is eligible for driving license");
        }
//Question 2
            int age2=16;
            if(age2<18){
                System.out.println("Person is not eligible for driving license");
        }
//Question 3
        int batsmanvirat=133;
            if(batsmanvirat>100){
                System.out.println("Hurray!!! Batsman has scored a century!");
        }
//Question 4
        int batsmanrohit=97;
        if(batsmanrohit<100) {
            System.out.println("Oops!!! Batsman has failed to score his century!");
        }
//Question 5
    int price= 6999;
     if(price>5000){
         System.out.println("Item is costly!!");
     }
//Question 6
        String city ="Pune";
                if(city=="Pune"){
                    System.out.println("Man is from Pune");

        }
//Question 7
        int age3=21;
                if(age3>18) {
                    System.out.println("Welcome to voting system!!");
                }
                if(age3<18){
                    System.out.println("You are not eligible for voting as your age is less than 18 year!!");
                }
//Question 8
        int marks=32;
                if(marks>33){
                    System.out.println("Cleared the exam!!");
                }
                if(marks<33){
                    System.out.println("Not cleared the exam!!");
                }
//Question 9
        String harish="India";
                if(harish=="India"){
                    System.out.println("He is Indian!");
                }
                if(harish!="India"){
                    System.out.println("He is non Indian");
                }



    }
}

