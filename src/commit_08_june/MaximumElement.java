package commit_08_june;

public class MaximumElement {
    public static void main(String[] args) {

        int maximunElements[]={1,3,5,2,4};

        int number= maximunElements[0];

        for (int i=0; i<=4; i++){
            if (maximunElements[i]>number){
                number = maximunElements[i];

            }
        }
        System.out.println("Maximun Element is= "+number);
    }
}
