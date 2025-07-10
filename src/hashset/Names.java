package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Names {


    public HashSet<String> namesList() {

        boolean flag = true;
        HashSet<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("please enter studentNames");
            String name= scanner.nextLine();
            names.add(name);
            System.out.println("Please entered StudentNames name if you add more names then press 1 otherwise press any key to exit");
            String input=scanner.nextLine();
            if (!input.equals("1")){
                flag = false;
            }
        }
        return names;
    }

    public static void main(String[] args) {

        Names obj = new Names();
        HashSet<String> output = obj.namesList();
        for (String name : output) {
            System.out.println("you entered studentNames as= "+name);
        }
    }
}
