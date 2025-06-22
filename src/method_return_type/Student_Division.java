package method_return_type;

public class Student_Division {

    public String Student1 (String username,int a, int b){
        String name= username;
        int percentage= b;
        int number =a;

        int result =(number*percentage/100);
        return name +" percentage is= "+result;
    }
    public String Student2 (String username,int a, int b) {
        String name = username;
        int percentage = b;
        int number = a;

        int result = (number * percentage / 100);
        return name + " percentage is= " + result;
    }

    public static void main(String[] args) {
        Student_Division obj= new Student_Division();

       String percentage= obj.Student1("kunal",76,100);
        System.out.println( percentage);

        percentage= obj.Student2("ayush",97,100);
        System.out.println( percentage);

    }
}
