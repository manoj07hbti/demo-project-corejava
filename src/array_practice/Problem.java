package array_practice;

public class Problem {

    public static void main(String[] args) {

        String countries[] ={"India","Austria","Australia","Germany","UAE","London"};

        for (int i=0;i<6;i++){
            System.out.println("Print "+countries[i]);
        }

        int i=0;
        while (i<6){
            System.out.println("While Loop "+countries[i]);
            i++;
        }

        int j=0;
        do {
            System.out.println("Using Do while.."+countries[j]);
            j++;
        }while (i<6);
    }
}
