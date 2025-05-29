package array_working;

public class Demo_Array {

    public static void main(String[] args) {

        String name[] ={"Neeshu","Rahul","Jay","Tannu","Abhi"};

       // System.out.println("Print String name Array..."+name[4]);

        // We need to Print All Index at a time

        // Using For Loop
        for (int i=0;i<5;i++){
            System.out.println("Print All Index.."+ i+" "+name[i]);
        }

        // Using While Loop
        int j=0;
        while (j<5){
            System.out.println("Using while Loop to Print All Index.."+ j+" "+name[j]);
            j++;
        }

        //Using do While
        int k=0;
        do{
            System.out.println("Using Do while Loop to Print All Index.."+ k+" "+name[k]);
            k++;
        }while(k<5);

    }
}
