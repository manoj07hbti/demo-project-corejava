package Java_Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Day1 {

    public HashSet<String> CreateStringDemo(){
        HashSet<String> DemoString = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        while (flag){
            System.out.print("Enter Message: ");
            String message = scanner.nextLine();
            DemoString.add(message);
            System.out.print("Do you want to add another message press Y or not press any other key: ");
            String choice = scanner.nextLine();
            if (!(choice.equals("Y"))){
                flag=false;
            }
        }

        return DemoString;
    }


    public LinkedHashSet<String> SequenceString(){
        LinkedHashSet <String> DemoStringSequence = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        while (flag){
            System.out.print("Enter Message: ");
            String message = scanner.nextLine();
            DemoStringSequence.add(message);
            System.out.print("Do you want to add another message press Y or not press any other key: ");
            String choice = scanner.nextLine();
            if (!(choice.equals("Y"))){
                flag=false;
            }
        }
        return DemoStringSequence;
    }

    public static void main(String[] args) {
        Day1 obj = new Day1();
        System.out.println("Simple: "+obj.CreateStringDemo());
        System.out.println("Unique: "+obj.SequenceString());

        for (String var : obj.SequenceString()){
            System.out.println("String is: "+var);
        }
    }

}
