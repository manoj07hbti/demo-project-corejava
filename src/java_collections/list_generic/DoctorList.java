package java_collections.list_generic;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorList {

    public Doctor createDoctor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter docId: ");
        String doctorId = scanner.nextLine();
        System.out.println("Please Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please Enter Last Name : ");
        String lastName = scanner.nextLine();
        System.out.println("Please Enter Specialization : ");
        String specialization = scanner.nextLine();
        System.out.println("Please Enter Phone : ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Please Enter Email : ");
        String email = scanner.nextLine();

        Doctor doctor = new Doctor(doctorId,firstName,lastName,specialization,phoneNumber,email);

        return doctor;

    }

    public static void main(String[] args) {

        // write a logic to call create employee data based on user choice and add to the List
        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList<Doctor> doctorsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        DoctorList obj = new DoctorList();

        boolean flag = true;
        while (flag == true) {
            Doctor employeeObj = obj.createDoctor(); // create variable for store value of the Method
            doctorsList.add(employeeObj);
            System.out.println("Do you want add more Doctor ? press Y to continue or any other key to exit");
            String choice = scanner.nextLine();
            if (!choice.equals("Y")) {
                flag = false;
            }
            //  System.out.println(employeesList);
            for (Doctor var : doctorsList) {
                System.out.println("Doctor ID: " + var.getDoctorId() + ", First Name " + var.getFirstName() + " Last Name " + var.getLastName()+", Specialization: "+var.getSpecialization()+", Phone Number: "+var.getPhoneNumber()+", Email: "+var.getEmail());
            }
        }
    }
}
