package practice;

public class IfAndElse {
    public static void main(String[] args) {

        int number= 48;

        if (number>=51){
            System.out.println(number+" is greater than 51");
        }else{
            System.out.println(number+" is not greater than 51");
        }

        String country= "INDIA";
        String state= "punjab";
        String personname="tarun";

               if (country=="india"){
                   if (state=="punjab"){
                       if (personname=="tarun"){
                           System.out.println(personname+"belongs to "+country+"and state is "+state);
                       }else{
                           System.out.println(personname+"is not belongs to "+country+"and not from "+state);
                       }
                   }
               }

    }

}
