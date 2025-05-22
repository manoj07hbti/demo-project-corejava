package conditional_statement_if_else_nestedif;

public class CandidateNationality {

    public static void main(String[] args) {
        String name="Neeshu";
        String city="UAE";

        //if candidate is from INDIA then print INDIAN.
        if (city=="India"){
            System.out.println(name+ " is a Indian");
        }
        if (city!="India"){
            System.out.println(name+" is not an Indian. Because he is from "+city);
        }

    }
}
