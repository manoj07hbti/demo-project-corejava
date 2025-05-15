package conditional_statements;

public class OROpMultiCondition {

    public static void main(String[] args) {
      //Write a code for Laptop brand based on brand name and ram configuration we need show Good quality or  Not Good QUality
        String brandName="Lenovo";
        int ram=8;

        //1.   TRUE  || TRUE = TRUE
        if(brandName=="Lenovo" || ram>=8){
            System.out.println("Good Laptop");
        }else {
            System.out.println("Not Good Laptop");
        }

        //2.   TRUE  || FALSE= TRUE
        ram=6;
        if(brandName=="Lenovo" || ram>=8){
            System.out.println("Good Laptop");
        }else {
            System.out.println("Not Good Laptop");
        }

        //3.   FALSE || TRUE=  TRUE
         brandName="Dell";
        ram=16;
        if(brandName=="Lenovo" || ram>=8){
            System.out.println("Good Laptop");
        }else {
            System.out.println("Not Good Laptop");
        }

        //4.   FALSE || FALSE= FALSE
        brandName="Dell";
        ram=4;
        if(brandName=="Lenovo" || ram>=8){
            System.out.println("Good Laptop");
        }else {
            System.out.println("Not Good Laptop");
        }

    }
}
