package arrays;

public class ArrayCountry {

    public static void main(String[] args) {


        //string array country....


        String country1="India";
        String country2="Germany";
        String country3="china";
        String country4="Russia";
        String country5="Japan";

        String country[] ={"India","Germany","China","Russia","Japan"};

        for (int n=0; n<5; n++){
            System.out.println("printing country....: "+n+" "+country[n]);
        }

        //dowhileloop

        int n=0;
        do {
            System.out.println("printing country....: "+n+" "+country[n]);
            n++;
        }while (n<5);

        //while

        int k=0;
        while (k<5){
            System.out.println("printing country....: "+k+" "+country[k]);
            k++;
        }

        for (String name: country){
            System.out.println("printing using Advance loop....: "+ name);
        }


    }
}
