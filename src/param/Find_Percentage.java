package param;

public class Find_Percentage {

    public void percentage(int a, int b){

        int number = a;
        int percentage= b;

        int result =(number*percentage/100);
        System.out.println("result= "+result);
        }

    public static void main(String[] args) {
        Find_Percentage obj = new Find_Percentage();
        obj.percentage(5000,10);
        obj.percentage(2000,5);
        obj.percentage(300,5);
    }

    }

