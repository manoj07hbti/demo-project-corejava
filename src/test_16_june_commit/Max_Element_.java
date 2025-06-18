package test_16_june_commit;

public class Max_Element_ {

    public void maxElement(int[] num){

// int num [] ={3,28,19,87,49,76};

        int max =num[0];

        for (int a=1;a< num.length;a++){
            if (max>num[a]){

            }else {
                max=num[a];
            }
        }
        System.out.println("Maximum Element in the given array..."+max);

    }

    public static void main(String[] args) {
        int [] num ={3,28,19,87,49,76,99};

        Max_Element_ obj1= new Max_Element_();

        obj1.maxElement(num);
    }


}
