package demo_arrays;

public class AssignmentArrays {
    public static void main(String[] args) {

        //Question 1

        String [] country={"India","America","China","Russia"};
        for (int i=0; i<4; i++){
            System.out.println(country[i]);
        }

//        int [] marks;
//        marks = new int[5];
//        marks[0]=90;
//        marks[1]=80;
//        marks[2]=96;
//        marks[3]=94;
//        marks[4]=85;
//        System.out.println("marks");
//        System.out.println(marks[1]);

        int[] nums = new int[5];
        nums [0] =10;
        nums [1]=20;
        nums [2]=30;
        nums [3]=40;
        nums [4]=50;
        int sum=0;
        for (int i=0; i<5; i++){
            sum +=nums[i];
            System.out.println(sum);
        }
    }
}
