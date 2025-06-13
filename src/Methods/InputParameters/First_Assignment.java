package Methods.InputParameters;

import java.util.Scanner;

public class First_Assignment {

    public void cube(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = scanner.nextInt();
        System.out.println("Cube of given number is "+(a*a*a));
    }

    public static void main(String[] args) {
        First_Assignment object = new First_Assignment();
        object.cube();
    }
}
