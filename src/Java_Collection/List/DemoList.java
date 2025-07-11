package Java_Collection.List;

import java.util.ArrayList;

public class DemoList {

    public ArrayList storeInfo(){

        //ClassName objName= new ClassName();
        ArrayList list= new ArrayList();

        list.add("Manish");
        list.add(26);
        list.add(3847.21);
        list.add(true);


        return list;
    }

    public static void main(String[] args) {
        DemoList obj = new DemoList();
        ArrayList list = obj.storeInfo();

        System.out.println("Before Removing Element");
        int i=0;
        while(i< list.size()){
            System.out.println("Printing list using while loop at : "+ i +" Value: "+list.get(i));
            i++;
        }

        int j = 0;
        list.remove(2);
        System.out.println("After Removing Element");
        while (j<list.size()){
            System.out.println("Printing list using while loop at : "+ j +" Value: "+list.get(j));
            j++;
        }
    }


}
