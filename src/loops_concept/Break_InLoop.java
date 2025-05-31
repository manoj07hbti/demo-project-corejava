package loops_concept;

public class Break_InLoop {
    public static void main(String[] args) {

        for(int i=0 ; i<4; i++){
            if(i==2){
                break;
            }
            System.out.println(i);
        }
    }
}
