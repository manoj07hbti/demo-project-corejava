package loops;

public class even_num {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++)
            if (i % 2 == 0)
                System.out.println(+i);


    //while loop

    int k = 1;
        while(k <=100)

    {
        if (k % 2 == 0)
            System.out.println(+k);
        k++;

    }

    // do while loop
    int j = 1;
            do

    {
        if (j % 2 == 0)
            System.out.println(+j);
        j++;
    } while(j<=100);
}
}


