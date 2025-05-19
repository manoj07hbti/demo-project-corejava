package conditional_statement;

public class Or_Op_MultiCond {
    public static void main(String[] args) {

        // Selecting students for basketball team

        String player="basketball";
        double height= 5.5;
       if(player=="basketball" || height>=5.5){
           System.out.println("Selected: "+player + height);
       }else{
           System.out.println("Not selected: " +player +height);
       }

       height=5.3;
        if(player=="basketball" || height>=5.5){
            System.out.println("selected: " +player +height);
        }else{
            System.out.println("Not selected: "+player+height);
        }

        player="volleyball";
        height=5.8;
        if(player=="basketball" || height>=5.5){
            System.out.println("Selected: "+player +height);
        }else{
            System.out.println("not selected: " +player +height);
        }

        height=4.4;
        if(player=="basketball" || height>=5.5){
            System.out.println("Selected: " +player +height);
        }else{
            System.out.println("Not selected: "+player +height);
        }


    }
}
