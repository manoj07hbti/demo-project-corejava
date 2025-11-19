package java_collections.hashmap;
import modal.Student;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class DemoCollageData {

    public HashSet<Student> studentData1() {

        Scanner scanner1 = new Scanner(System.in);
        boolean flag1 = true;
        HashSet<Student> names1 = new HashSet<>();
        while (flag1) {
            System.out.println("Please enter Student name :");
            String studentNames = scanner1.nextLine();
            System.out.println("Please enter Student name :");
            int studentAges = scanner1.nextInt();
            System.out.println("Please enter Student name :");
            String studentSecs = scanner1.nextLine();
           // names1.add();
            System.out.println("Do you want to enter more names, press Y to continue or any other key to exit");
            String choice = scanner1.nextLine();
            if (!(choice.equals("Y") == true)) {
                flag1 = false;
            }
        }
        return names1;
    }
        public HashSet<String> studentData2() {

            Scanner scanner2 = new Scanner(System.in);
            boolean flag2 = true;
            HashSet<String> names2 = new HashSet<>();
            while (flag2) {
                System.out.println("Please enter Student name :");
                String studentName = scanner2.nextLine();
                names2.add(studentName);
                System.out.println("Do you want to enter more names, press Y to continue or any other key to exit");
                String choice = scanner2.nextLine();
                if (!(choice.equals("Y") == true)) {
                    flag2 = false;
                }
            }
            return names2;
        }
    HashMap<String, HashSet<Student>> companyWiseData = new HashMap<>();






    public static void main(String[] args) {

    }
}
