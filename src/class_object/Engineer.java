package class_object;

public class Engineer {
    String name = "rohan";
    int age = 27;
    String course = "cyber security";
    String university = "Bahra university";
    String batch = "2024-2028" ;

    public static void main(String[] args) {
        Engineer obj1 = new Engineer();

        System.out.println("name = " +obj1.name +"  age = "+obj1.age +"  Course = "+obj1.course +" University = "+obj1.university +" Batch = "+obj1.batch);
    }
}
