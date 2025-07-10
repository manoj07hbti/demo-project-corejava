package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Age {

    public HashSet<Integer> personAge() {

        HashSet<Integer> age = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("please enter person age");
            Integer perAge = scanner.nextInt();
            age.add(perAge);
            Scanner scanner1= new Scanner(System.in);
            System.out.println("you want to add more personage if yes then press key Z otherwise press any key to exit");
            String input = scanner1.nextLine();
            if (!input.equals("Z")) {
                flag = false;
            }
        }
        return age;
    }

    public static void main(String[] args) {

        Age obj = new Age();
        HashSet<Integer> output = obj.personAge();
        for (Integer var : output) {
            System.out.println("you entered personAge as= " +var);
        }
    }
}
