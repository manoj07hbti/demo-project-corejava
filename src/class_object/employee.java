package class_object;
public class employee {
    //member of employee
    String name = "parvej";
    int emp_id = 56458654;
    String branch = "back end";
   String D_O_B = "16/08/2004";
   String sex = "male";

    public static void main(String[] args) {

        employee obj1 = new employee();

        System.out.println("Employee name : "+obj1.name +" Employee id: "+obj1.emp_id +" Branch "+obj1.branch +" Date of birth: "+obj1.D_O_B +" gender: "+obj1.sex);
    }


}


