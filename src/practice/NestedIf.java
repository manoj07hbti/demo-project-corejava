package practice;

public class NestedIf {
    public static void main(String[] args) {

        String country= "india";
        String state= "punjab";
        String personname="tarun";

        if (country=="india"){
            if (state=="punjab"){
                if (personname=="tarun"){
                    System.out.println(personname+" belongs to "+country+" and state is "+state);
                }else{
                    System.out.println(personname+" is not belongs to "+country+" and not from "+state);
                }
            }else{
                System.out.println("invalid person name and country , state....");

            }
        }

    }
}
