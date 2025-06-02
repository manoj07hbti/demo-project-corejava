package array_practice;

public class Int_Array_City_Distance {

    public static void main(String[] args) {

        String cityName[]={"Delhi","Uttar Pradesh","Agra","Lucknow","Ayodhya","Shimla"};

        int distance []={150,173,126,187,190,500};

        for (int i=0;i<6;i++) {

            System.out.println("Printing City along with the Distance :" + i + " City- " + cityName[i] + " :" + distance[i]);

        }


        // Using while
        int j=0;

        System.out.println("============================================");
        System.out.println("===========Using While Loop=============");
        while(j<6){
            System.out.println("Using While Loop Printing City along with the Distance :" + j + " City- " + cityName[j] + " :" + distance[j]);
            j++;
        }

    }
}
