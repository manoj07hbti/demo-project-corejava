package test_8_june_commit;

public class Max_Element {

    // Write a  code to find Maximum Element Given Array.

    public static void main(String[] args) {

        int element [] ={1,3,5,2,4,7};
        int max= element[0];

        for (int i=1;i<element.length;i++){
            if (element[i]>max){
                max=element[i];
            }
        }
        System.out.println("The Maximum element in the Given Array..."+max);
    }
}
