package array_practice;

public class CompanyBrandArray {
    public static void main(String[] args) {

        String brandnames[]={"Lenovo","Hp","Sony","Dell","Apple"};
//        System.out.println(brandnames[3]);

// print best laptop using for loop
        for (int i=0; i<=4; i++){
            System.out.println("best laptop brands= "+brandnames[i]);
        }
        System.out.println();

// print best laptop using While loop
        int i=0;
        while (i<=4){
                System.out.println("best laptop brands= "+brandnames[i]);
            i++;

        }
        System.out.println();

// print best laptop using Do While loop
        int j=0;
        do {
            System.out.println("best laptop brand"+brandnames[j]);
            j++;
        }while (j<=4);
        System.out.println();

// print best laptop using advanced loop
        for (String name:brandnames){
            System.out.println("best laptop brands= "+name);
        }

    }
}
