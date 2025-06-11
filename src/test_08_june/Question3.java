package test_08_june;

public class Question3 {
    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4, 5};
        int i = 0;
        int j = num.length-1;
        int temp;
        while(i<j){
            temp=num[i];
            num[i]=num[j];
            num[j]=temp;
            i++; j--;
        }
        System.out.println("Reverse Array");
        for (int revNum : num){
            System.out.print(revNum);

        }    }

}
