package conditional_statements;

public class AndOpMultiCondition {
    public static void main(String[] args) {

    //Question 1
        int percentage=88;
        if (percentage>=33 && percentage<60){
            System.out.println("Student is in Second division");
        }else if (percentage>=60 && percentage<75){
            System.out.println("Student is in First division");
        }else if(percentage>75){
            System.out.println("Student is Gold medalist");
        }
        //Question 2
        int age=82;
        if (age>0 && age<18){
            System.out.println("you are child");
        }else if (age>=18 && age<=40){
            System.out.println("you are young");
        }else if(age>=41 && age<=60){
            System.out.println("you are in old age");
        }
    //Quesiton 3
        int number = 9;
        if (number % 3 != 0) {
            System.out.println(number + " is NOT divisible by 3.");
        } else {
            System.out.println(number + " is divisible by 3.");
        }


    }
}

