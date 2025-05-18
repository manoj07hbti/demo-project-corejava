package test_18_may;

public class Test_18_May {
    public static void main(String[] args) {
        //Question 1
        int age=13;
        String city="Pune";
        if (age>18 && city=="Pune" ){
            System.out.println("Person is eligible voter in Pune");
        }else{
            System.out.println("Person is not eligible voter in Pune");
        }
        //Question 2
        double num=500;
        double percentage=5;
        double result=(percentage/100)*num;
        System.out.println("Percentage of 500 is " + result+ "%")  ;

        //Question 3
        int num1=5;
        if (num1%2==0){
            System.out.println(num1 + " is an even number");
        }else{
            System.out.println(num1 + " is a odd number");
        }
        //Question 3
        String nationality="russian";
        String state="pune";
        if (nationality=="Indian"){
            if (state=="Maharashtra"){
                System.out.println("Person's nationality is " + nationality + " and state is " + state);
            }else{
                System.out.println("Person's nationality is " + nationality + " and state is  different " + state);
            }
        }else {
            System.out.println("Person is not Indian, his nationality is " + nationality);
        }
        //Question 4
        int percent=63;
        if (percent>=33 && percent<60){
            System.out.println("Student is in Second division");
        }else if (percent>=60 && percent<75){
            System.out.println("Student is in First division");
        }else if(percent>75){
            System.out.println("Student is Gold medalist");
        }

        //Question 5
        int age1=60;
        if (age1>0 && age1<18){
            System.out.println("you are child");
        }else if (age1>=18 && age1<=40){
            System.out.println("you are young");
        }else if(age1>=41 && age1<60){
            System.out.println("you are in middle age");
        }else if (age1>=60){
            System.out.println("you are in old age");
        }else
            System.out.println("you have entered wrong age");

        //Quesiton 6
        int number = 9;
        if (number % 3 != 0) {
            System.out.println(number + " is NOT divisible by 3");
        } else {
            System.out.println(number + " is divisible by 3");
        }





    }
}
