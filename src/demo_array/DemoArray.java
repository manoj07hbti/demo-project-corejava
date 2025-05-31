package demo_array;

public class DemoArray {
    public static void main(String[] args) {

        //using array
        String country[]={"dubia","america","india","canada","china","pakistan"};
        System.out.println(country[3]);

        int Distance[]={74,23,76,44,42,07,55};
        System.out.println(Distance[5]);

        double Height[]={5.2,6.1,7.2,4.4,5.0,6.9};
        System.out.println(Height[1]);

        //using for loop
        String Country[]={"dubia","america","india","canada","china","pakistan"};
        for (int a=0; a<=5; a++) {
            System.out.println("country name : " + a + "=" + Country[a]);
        }

        //using While loop
        String City[]={"reasi","jammu","delhi","pune","katra","udhampur"};
        int i=0;
        while (i<=5);{
                System.out.println(City[i]);
                i++;
            }

        //using dowhile loop
        String Names[]={"aman","rohit","majeet","amit","rahul","rohan"};
        int x=0;
        do {
            System.out.println(Names[x]);
            x++;
        }while (x<=5);

    }
}
