package test_08_june;

public class Question6 {
    public static void main(String[] args) {


//        System.out.println("Printing duplicate number");
//        int[] a = {1, 2, 3, 4, 2, 3, 5};
//        for (int i=0; i<a.length; i++){
//            for (int j=i+1; j<a.length; j++){
//                if ((a[i]==a[j]&&(i!=j))){
//                    System.out.print(a[j] + " " );
//                }
//            }
//        }

        System.out.println("Printing duplicate number");
        int[] a = {1, 2, 3, 4, 2, 3, 5};
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                if ((a[i]==a[j])){
                    System.out.print(a[j] + " " );
                    break;
                }
            }
        }




    }
}
