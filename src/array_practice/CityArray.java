package array_practice;

public class CityArray {
    public static void main(String[] args) {

        String city[]={"Delhi","Punjab","kolkata","Pune"};
      //   System.out.println(city[3]);

// print city names for loop
        for (int i=0; i<=3; i++){
            System.out.println(city[i]);
        }
        System.out.println();

// // print city names while loop

        int i=0;
        while (i<=3){
            System.out.println(city[i]);
            i++;
        }
        System.out.println();

// print city names using Do While loop

        int j=0;
      do {
          System.out.println(city[j]);
          j++;
      }while (j<=3);
        System.out.println();

// print city names using advanced loop

      for (String citynames:city){
          System.out.println(citynames);
      }

    }
}
