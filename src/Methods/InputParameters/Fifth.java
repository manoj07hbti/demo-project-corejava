package Methods.InputParameters;

public class Fifth {
    public void Percentage(int num, int percen){
        int result = (num*percen)/100;
        System.out.println("percentage is "+result);
    }

    public static void main(String[] args) {
        Fifth obj = new Fifth();

        obj.Percentage(5000,10);
        obj.Percentage(78,4);
        obj.Percentage(7427,63);
    }
}
