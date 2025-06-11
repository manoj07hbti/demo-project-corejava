package methods_assignment;

//  // write a method which will tell square of given number

public class Methods {

public void square(){
    int number= 5;
    System.out.println("the square of given number is= "+number*number);
}

// wrtie a method which can tell whether person is eligible for voting or not

public void eligible_for_voting_or_not(){

    int age=18;
    if (age >=18){
        System.out.println("this person is eligible for voting= "+age);
    }else {
        System.out.println("this person is not eligible for voting= "+age);
    }
}

// write a method which can tell number is even or odd

public void even_And_Odd(){

    for (int i=1; i<=10; i++){
        if (i%2==0){
            System.out.println(i+ " is even number");
        }else{
            System.out.println(i+" is odd number");
        }
    }
}
    public static void main(String[] args) {

    Methods obj =new Methods();
    obj.square();
    obj.eligible_for_voting_or_not();
    obj.even_And_Odd();
    }
}
