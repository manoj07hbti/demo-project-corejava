package array_practice;

public class NameArray {
    public static void main(String[] args) {

        String name[]={"tarun","varun","kunal","deepanshu","raman"};
//       System.out.println(name[3]);

        for (int i=0; i<=4; i++){
            System.out.println(name[i]);
        }
        System.out.println();


        int i=0;
        while (i<=4){
            System.out.println(name[i]);
            i++;
        }
        System.out.println();

        int j=0;
        do {
            System.out.println(name[j]);
            j++;
        }while (j<=4);
        System.out.println();


        for (String nam:name){
            System.out.println(nam);
        }


    }
}
